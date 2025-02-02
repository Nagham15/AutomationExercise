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
    private By homeIcon=By.xpath("//a[normalize-space()='Home']");
    private By signUpAndLoginButton =By.cssSelector("a[href='/login']");
    private By userLoggedIn=By.cssSelector(".fa.fa-user");
    private By deleteAccountButton =By.cssSelector("a[href='/delete_account']");
    private By logOutButton =By.cssSelector("a[href='/logout']");
    private By contactUsButton=By.cssSelector("a[href='/contact_us']");
    private By testCasesButton=By.cssSelector("a[href='/test_cases']");



    //TODO: define action methods
    public boolean isHomeIconVisible(){
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
}
