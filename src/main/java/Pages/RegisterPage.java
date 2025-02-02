package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    Select select;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By enterAccountInfo=By.xpath("//b[normalize-space()='Enter Account Information']");
    private By title=By.xpath("//input[@value='Mrs']");
    private By userPassword=By.id("password");
    private By dayOfBirth=By.id("days");
    private By monthOfBirth=By.id("months");
    private By yearOfBirth=By.id("years");
    private By checkBoxSignUp=By.id("newsletter");
    private By checkBoxReceiveOffers=By.id("optin");
    private By firstName=By.id("first_name");
    private By lastName=By.id("last_name");
    private By address=By.id("address1");
    private By country=By.id("country");
    private By state=By.id("state");
    private By city=By.id("city");
    private By zipCode=By.id("zipcode");
    private By mobileNumber=By.id("mobile_number");
    private By createAccountButton=By.cssSelector("button[data-qa='create-account']");


    //TODO: define action methods
    public boolean isEnterAccountInformationVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAccountInfo));
        return driver.findElement(enterAccountInfo).isDisplayed();
    }
    public void selectTitle(){
       driver.findElement(title).click();
    }
    public void addPassword(String password){
      driver.findElement(userPassword).sendKeys(password);
    }
    public void selectDateOfBirth(){
        WebElement daysList=driver.findElement(dayOfBirth);
        select=new Select(daysList);
        select.selectByVisibleText("15");
        WebElement monthsList=driver.findElement(monthOfBirth);
        select=new Select(monthsList);
        select.selectByVisibleText("November");
        WebElement yearsList=driver.findElement(yearOfBirth);
        select=new Select(yearsList);
        select.selectByVisibleText("2000");
    }
    public void markSignUpCheckBox(){
        driver.findElement(checkBoxSignUp).click();
    }
    public void markReceiveOffersCheckBox(){
          driver.findElement(checkBoxReceiveOffers).click();
    }
    public void addFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void addLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void addAddress(String yourAddress){
        driver.findElement(address).sendKeys(yourAddress);
    }
    public void selectCountry(){
       WebElement list= driver.findElement(country);
       select=new Select(list);
       select.selectByVisibleText("United States");
    }
    public void addState(String yourState){
        driver.findElement(state).sendKeys(yourState);
    }
    public void addCity(String yourCity){
        driver.findElement(city).sendKeys(yourCity);
    }
    public void addZipCode(String yourZipCode){
        driver.findElement(zipCode).sendKeys(yourZipCode);
    }
    public void addMobileNumber(String yourMobile){
        driver.findElement(mobileNumber).sendKeys(yourMobile);
    }
    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }



}
