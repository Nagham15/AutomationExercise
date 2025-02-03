package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductDetailsPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProductDetailsPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By productName=By.xpath("//h2[text()='Blue Top']");
    private By category=By.xpath("//p[normalize-space()='Category: Women > Tops']");
    private By price=By.xpath("//span[normalize-space()='Rs. 500']");
    private By availability=By.xpath("//b[normalize-space()='Availability:']");
    private By condition=By.xpath("//b[normalize-space()='Condition:']");
    private By brand=By.xpath("//b[normalize-space()='Brand:']");



    //TODO: define action methods
    public boolean isProductNameDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        return driver.findElement(productName).isDisplayed();
    }
    public boolean isCategoryDisplayed(){
        return driver.findElement(category).isDisplayed();
    }
    public boolean isPriceDisplayed(){
        return driver.findElement(price).isDisplayed();
    }
    public boolean isAvailabilityDisplayed(){
        return driver.findElement(availability).isDisplayed();
    }
    public boolean isConditionDisplayed(){
        return driver.findElement(condition).isDisplayed();
    }
    public boolean isBrandDisplayed(){
        return driver.findElement(brand).isDisplayed();
    }

}
