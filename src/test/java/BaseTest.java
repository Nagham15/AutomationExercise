import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

public class BaseTest {
    WebDriver driver;
    HomePage HP;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        HP=new HomePage(driver);
        assertTrue(HP.isHomePageVisible());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
