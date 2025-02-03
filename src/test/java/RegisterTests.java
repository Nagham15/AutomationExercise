import Pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegisterTests extends BaseTest{
    HomePage HP;
    LoginPage LP;
    RegisterPage RP;
    AccountCreatedPage AC;
    DeleteAccountPage DA;

    @BeforeMethod
    public void preConditions(){
       HP=new HomePage(driver);
       LP=new LoginPage(driver);
       RP=new RegisterPage(driver);
       AC=new AccountCreatedPage(driver);
       DA=new DeleteAccountPage(driver);
    }

    @Test(priority = 1,description = "Register with valid data")
    public void registerUser(){
        assertTrue(HP.isHomePageVisible());
        HP.clickOnSignUpAndLogin();
        assertTrue(LP.isNewUserSignupVisible());
        LP.signUpSteps("Nagham Abdelrahman","nagham125@gmail.com");
//        LP.addUserName("Nagham Abdelrahman");
//        LP.addSignUpEmail("nagham125@gmail.com");
//        LP.clickSignUpButton();
        assertTrue(RP.isEnterAccountInformationVisible());
        RP.selectTitle();
        RP.addPassword("123456789");
        RP.selectDateOfBirth();
        RP.markSignUpCheckBox();
        RP.markReceiveOffersCheckBox();
        RP.addFirstName("Nagham");
        RP.addLastName("Abdelrahman");
        RP.addAddress("Cairo");
        RP.selectCountry();
        RP.addState("Egypt");
        RP.addCity("El-Khanka");
        RP.addZipCode("12345");
        RP.addMobileNumber("0123456789");
        RP.clickCreateAccountButton();
        assertTrue(AC.isAccountCreatedTextVisible());
        AC.clickContinueButton();
        assertTrue(HP.checkIfUserLoggedIn());
        HP.clickDeleteAccount();
        assertTrue(DA.isDeleteAccountTextVisible());


    }

}
