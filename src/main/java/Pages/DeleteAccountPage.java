package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteAccountPage {
    WebDriver driver;
    WebDriverWait wait;
    public DeleteAccountPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By deleteAccountText=By.xpath("//b[normalize-space()='Account Deleted!']");
    //TODO: define action methods
    public boolean isDeleteAccountTextVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteAccountText));
        return driver.findElement(deleteAccountText).isDisplayed();
    }

}
