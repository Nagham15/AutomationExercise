package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProductsPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By allProductsText=By.xpath("//h2[normalize-space()='All Products']");
    private By listOfProducts=By.className("features_items");
    private By productOne=By.cssSelector("a[href='/product_details/1']");
    private By searchField=By.id("search_product");
    private By searchIcon=By.id("submit_search");
    private By searchedProductsText=By.xpath("//h2[normalize-space()='Searched Products']");


    //TODO: define action methods
    public boolean isAllProductsTextVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsText));
        return driver.findElement(allProductsText).isDisplayed();
    }
    public boolean isProductListIsNotEmpty(){
        List<WebElement> products = driver.findElements(listOfProducts);
        return !products.isEmpty();
    }
    public void clickViewProductForProductOne(){
        driver.findElement(productOne).click();
    }
    public void addProductNameToSearch(String productName){
        driver.findElement(searchField).sendKeys(productName);
    }
    public void clickSearch(){
        driver.findElement(searchIcon).click();
    }
    public boolean isSearchedProductsTextVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchedProductsText));
        return driver.findElement(searchedProductsText).isDisplayed();
    }
    public boolean isSearchedProductVisible(){
        return driver.findElement(productOne).isDisplayed();
    }

}
