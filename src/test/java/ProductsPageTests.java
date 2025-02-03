import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;

public class ProductsPageTests extends BaseTest{
    HomePage HP;
    ProductsPage PP;
    ProductDetailsPage PD;
    SoftAssert softAssert=new SoftAssert();
    @BeforeMethod
    public void preConditions(){
       HP=new HomePage(driver);
       PP=new ProductsPage(driver);
       PD=new ProductDetailsPage(driver);
    }
    @Test(description = "Verify All Products and product detail page")
    public void verifyProducts(){
        assertTrue(HP.isHomePageVisible(),"Home page is not visible");
        HP.clickProducts();
        assertTrue(PP.isAllProductsTextVisible(),"All products text is not visible");
        assertTrue(PP.isProductListIsNotEmpty(), "Products list is empty!");
        PP.clickViewProductForProductOne();
        softAssert.assertTrue(PD.isProductNameDisplayed(),"Product name is not displayed");
        softAssert.assertTrue(PD.isCategoryDisplayed(),"Category is not displayed");
        softAssert.assertTrue(PD.isPriceDisplayed(),"Price is not displayed");
        softAssert. assertTrue(PD.isAvailabilityDisplayed(),"Availability is not displayed");
        softAssert. assertTrue(PD.isConditionDisplayed(),"Condition is not displayed");
        softAssert. assertTrue(PD.isBrandDisplayed(),"Brand is not displayed");
        softAssert.assertAll();



    }
}
