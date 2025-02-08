package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ProductsPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        action=new Actions(driver);
    }
    // TODO: define locators
    private By allProductsText=By.xpath("//h2[normalize-space()='All Products']");
    private By listOfProducts=By.className("features_items");
    private By productOne=By.cssSelector("a[href='/product_details/1']");
    private By searchField=By.id("search_product");
    private By searchIcon=By.id("submit_search");
    private By searchedProductsText=By.xpath("//h2[normalize-space()='Searched Products']");
    private By addToCartButtonForProduct1=By.cssSelector("a[data-product-id='1']");
    private By continueShoppingButton=By.xpath("//button[normalize-space()='Continue Shopping']");
    private By productTwo=By.cssSelector("a[href='/product_details/2']");
    private By addToCartButtonForProduct2=By.cssSelector("a[data-product-id='2']");
    private By viewCart=By.xpath("//u[normalize-space()='View Cart']");
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


    public void hoverOverFirstProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productOne));
        action.moveToElement(driver.findElement(productOne)).perform();
    }
    public void clickAddToCartButtonForProductOne(){
        driver.findElement(addToCartButtonForProduct1).click();
    }
    public void clickContinueShoppingButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingButton));
        driver.findElement(continueShoppingButton).click();
    }
    public void hoverOverSecondProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(productTwo));
        action.moveToElement(driver.findElement(productTwo)).perform();
    }
    public void clickAddToCartButtonForProductTwo(){
        driver.findElement(addToCartButtonForProduct2).click();
    }
    public void clickViewCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCart));
        driver.findElement(viewCart).click();
    }

}
