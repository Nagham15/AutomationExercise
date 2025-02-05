import Pages.DeleteAccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginPageTests extends BaseTest{
    HomePage HP;
    LoginPage LP;
    DeleteAccountPage DP;
    @BeforeMethod
    public void preConditions(){
       HP=new HomePage(driver);
       LP=new LoginPage(driver);
       DP=new DeleteAccountPage(driver);
        assertTrue(HP.isHomePageVisible());
        HP.clickOnSignUpAndLogin();
    }
    @Test (priority = 1,description = "Login User with correct email and password")
    public void validLogin(){
        assertTrue(LP.isLoginToYourAccountTextVisible());
        LP.loginSteps("naghamabdelrahman15@gmail.com","1234567");
        assertTrue(HP.checkIfUserLoggedIn());
        HP.clickDeleteAccount();
        assertTrue(DP.isDeleteAccountTextVisible());
    }
    @Test(priority = 2, description = "Login User with incorrect email and password")
    public void invalidLogin(){
        assertTrue(LP.isLoginToYourAccountTextVisible());
        LP.loginSteps("nagham@gmail.com","1234567");
        assertTrue(LP.isValidationLoginMessageVisible());
    }
    @Test(priority = 3,description = "Register User with existing email")
    public void singUpWithExistingEmail(){
        assertTrue(LP.isNewUserSignupVisible());
        LP.signUpSteps("nagham","naghamabdelrahman15@gmail.com");
        assertTrue(LP.isValidationSignUpMessageVisible());
    }
}
