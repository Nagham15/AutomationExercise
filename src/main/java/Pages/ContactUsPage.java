package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ContactUsPage {
    WebDriver driver;
    WebDriverWait wait;

    public ContactUsPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    // TODO: define locators
    private By getInTouchText=By.xpath("//h2[normalize-space()='Get In Touch']");
    private By userNameField=By.cssSelector("input[placeholder='Name']");
    private By emailField=By.cssSelector("input[placeholder='Email']");
    private By subjectField=By.name("subject");
    private By yourMessageField=By.id("message");
    private By chooseFile=By.name("upload_file");
    private By submitButton=By.name("submit");

    //TODO: define action methods
    public boolean isGetInTouchTextVisible(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(getInTouchText));
       return driver.findElement(getInTouchText).isDisplayed();
    }
    public void enterName(String name){
     driver.findElement(userNameField).sendKeys(name);
    }
    public void enterEmail(String email){
      driver.findElement(emailField).sendKeys(email);
    }
    public void enterSubject(String subject){
      driver.findElement(subjectField).sendKeys(subject);
    }
    public void enterYourMessageHere(String message){
      driver.findElement(yourMessageField).sendKeys(message);
    }
    public void uploadFile(String filePath){
        driver.findElement(chooseFile).sendKeys(filePath);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }
}
