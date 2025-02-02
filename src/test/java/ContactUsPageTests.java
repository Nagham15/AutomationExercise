import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertTrue;

public class ContactUsPageTests extends BaseTest{
    HomePage HP;
    ContactUsPage CP;
    String filePath=new File("src/test/files/Nagham-Abdelrahman-Testing-Engineer.pdf").getAbsolutePath();
    @BeforeMethod
    public void preConditions(){
      HP=new HomePage(driver);
      CP=new ContactUsPage(driver);
    }
    @Test(description = "Check Contact Us Form")
    public void contactUs(){
        assertTrue(HP.isHomeIconVisible());
        HP.clickContactUs();
        assertTrue(CP.isGetInTouchTextVisible());
        CP.enterName("Nagham");
        CP.enterEmail("naghamabdelrahman15@gmail.com");
        CP.enterSubject("my cv");
        CP.enterYourMessageHere("i will upload my cv here");
        CP.uploadFile(filePath);
        CP.clickSubmitButton();

    }
}
