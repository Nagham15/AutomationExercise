import Pages.HomePage;
import Pages.LoginPage;
import Pages.TestCasesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTest{

    LoginPage LP;
    TestCasesPage TC;
    @BeforeMethod
    public void preConditions(){
        LP=new LoginPage(driver);
      TC=new TestCasesPage(driver);

    }
    @Test(description = "Check Contact Us Form")
    public void contactUs(){
        assertTrue(HP.isHomePageVisible());
        HP.clickContactUs();

    }
    @Test(description = "Check the functionality of logout button")
    public void logOutUser(){
        HP.clickOnSignUpAndLogin();
        LP.loginSteps("naghamabdelrahman15@gmail.com","1234567");
        assertTrue(HP.checkIfUserLoggedIn());
        HP.clickLogOut();
        assertEquals(LP.getLoginPageURL(),"https://automationexercise.com/login");

    }
    @Test(description = "Verify test cases page is opened")
    public void testCasesOption(){
        HP.clickTestCases();
        assertEquals(TC.getTestCasesPageURL(),"https://automationexercise.com/test_cases");
    }
    @Test(description = "Verify Subscription in home page")
    public void subscription(){
        assertTrue(HP.isSubscriptionTextVisible());
        HP.subscriptionSteps("naghamabdelrahman11@gmail.com");


    }

}
