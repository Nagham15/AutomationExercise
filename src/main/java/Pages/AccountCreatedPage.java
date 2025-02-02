package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountCreatedPage {
    WebDriver driver;
    WebDriverWait wait;

    public AccountCreatedPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By accountCreatedText=By.xpath("//h2[@data-qa='account-created']");
    private By continueButton=By.xpath("//a[normalize-space()='Continue']");

    //TODO: define action methods
    public boolean isAccountCreatedTextVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedText));
         return driver.findElement(accountCreatedText).isDisplayed();
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
}
