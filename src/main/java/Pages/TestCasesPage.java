package Pages;

import org.openqa.selenium.WebDriver;

public class TestCasesPage {
    WebDriver driver;
    // TODO: define locators
    public TestCasesPage(WebDriver driver){
        this.driver=driver;
    }
    //TODO: define action methods
    public String getTestCasesPageURL(){
        return driver.getCurrentUrl();
    }
}
