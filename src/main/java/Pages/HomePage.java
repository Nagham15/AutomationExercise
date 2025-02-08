package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // TODO: define locators
    private By homeIcon=By.cssSelector("a[style='color: orange;']");
    private By signUpAndLoginButton =By.cssSelector("a[href='/login']");
    private By userLoggedIn=By.cssSelector(".fa.fa-user");
    private By deleteAccountButton =By.cssSelector("a[href='/delete_account']");
    private By logOutButton =By.cssSelector("a[href='/logout']");
    private By contactUsButton=By.cssSelector("a[href='/contact_us']");
    private By testCasesButton=By.cssSelector("a[href='/test_cases']");
    private By productsButton=By.cssSelector("a[href='/products']");
    private By subscriptionText=By.xpath("//h2[normalize-space()='Subscription']");
    private By emailField=By.id("susbscribe_email");
    private By arrowButton=By.cssSelector(".fa.fa-arrow-circle-o-right");

    private By cartButton=By.cssSelector("a[href='/view_cart']");

    //TODO: define action methods
    public boolean isHomePageVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeIcon));
        return driver.findElement(homeIcon).isDisplayed();
    }
    public void clickOnSignUpAndLogin(){
        driver.findElement(signUpAndLoginButton).click();
    }
    public boolean checkIfUserLoggedIn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userLoggedIn));
        return driver.findElement(userLoggedIn).isDisplayed();
    }
    public void clickDeleteAccount(){
        driver.findElement(deleteAccountButton).click();
    }
    public void clickLogOut(){
       driver.findElement(logOutButton).click();
    }
    public void clickContactUs(){
        driver.findElement(contactUsButton).click();
    }
    public void clickTestCases(){
        driver.findElement(testCasesButton).click();
    }
    public void clickProducts(){
        driver.findElement(productsButton).click();
    }
    public boolean isSubscriptionTextVisible(){
       return driver.findElement(subscriptionText).isDisplayed();
    }
    public void subscriptionSteps(String email){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(arrowButton).click();
    }

    public void clickCart(){
        driver.findElement(cartButton).click();
    }
}
