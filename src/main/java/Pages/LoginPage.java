package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By newUserSignupText =By.xpath("//h2[normalize-space()='New User Signup!']");
    private By userNameField=By.cssSelector("input[placeholder='Name']");
    private By emailSignUpField =By.xpath("//input[@data-qa='signup-email']");
    private By signUpButton=By.xpath("//button[normalize-space()='Signup']");
    private By loginToYourAccountText=By.xpath("//h2[normalize-space()='Login to your account']");
    private By emailLoginField=By.xpath("//input[@data-qa='login-email']");
    private By passwordField=By.cssSelector("input[data-qa='login-password']");
    private By loginButton=By.xpath("//button[normalize-space()='Login']");
    private By validationLoginMessage =By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    private By validationSignUpMessage=By.xpath("//p[normalize-space()='Email Address already exist!']");


    //TODO: define action methods
    public boolean isNewUserSignupVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(newUserSignupText));
        return driver.findElement(newUserSignupText).isDisplayed();
    }
    public void signUpSteps(String name,String email){
        driver.findElement(userNameField).sendKeys(name);
        driver.findElement(emailSignUpField).sendKeys(email);
        driver.findElement(signUpButton).click();
    }
    public boolean isLoginToYourAccountTextVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginToYourAccountText));
        return  driver.findElement(loginToYourAccountText).isDisplayed();
    }
    public void loginSteps(String email,String password){
        driver.findElement(emailLoginField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    public boolean isValidationLoginMessageVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(validationLoginMessage));
        return driver.findElement(validationLoginMessage).isDisplayed();
    }
    public String getLoginPageURL(){
        return driver.getCurrentUrl();
    }
    public boolean isValidationSignUpMessageVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(validationSignUpMessage));
        return driver.findElement(validationSignUpMessage).isDisplayed();
    }


}
