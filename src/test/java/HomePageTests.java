import Pages.HomePage;
import Pages.LoginPage;
import Pages.TestCasesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest{
    HomePage HP;
    LoginPage LP;
    TestCasesPage TC;
    @BeforeMethod
    public void preConditions(){
      HP=new HomePage(driver);
      LP=new LoginPage(driver);
      TC=new TestCasesPage(driver);
    }
    @Test(description = "Check Contact Us Form")
    public void contactUs(){
        assertTrue(HP.isHomeIconVisible());
        HP.clickContactUs();

    }
    @Test(description = "Check the functionality of logout button")
    public void logOutUser(){
        assertTrue(HP.isHomeIconVisible());
        HP.clickOnSignUpAndLogin();
        LP.loginSteps("naghamabdelrahman15@gmail.com","1234567");
        assertTrue(HP.checkIfUserLoggedIn());
        HP.clickLogOut();
        assertEquals(LP.getLoginPageURL(),"https://automationexercise.com/login");

    }
    @Test(description = "Verify test cases page is opened")
    public void testCasesOption(){
        assertTrue(HP.isHomeIconVisible());
        HP.clickTestCases();
        assertEquals(TC.getTestCasesPageURL(),"https://automationexercise.com/test_cases");
    }
}
