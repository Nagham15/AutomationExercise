package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By subscriptionText=By.xpath("//h2[normalize-space()='Subscription']");
    private By emailField=By.id("susbscribe_email");
    private By arrowButton=By.cssSelector(".fa.fa-arrow-circle-o-right");
    private By productOne=By.id("product-1");
    private By productTwo=By.id("product-2");

    //TODO: define action methods
    public boolean isSubscriptionTextVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(subscriptionText));
        return driver.findElement(subscriptionText).isDisplayed();
    }
    public void subscriptionSteps(String email){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(arrowButton).click();
    }
    public boolean isProductOneDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productOne));
        return driver.findElement(productOne).isDisplayed();
    }
    public boolean isProductTwoDisplayed(){
        return driver.findElement(productTwo).isDisplayed();
    }

}
