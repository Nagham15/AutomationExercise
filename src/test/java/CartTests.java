import Pages.CartPage;

import Pages.ProductsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTests extends BaseTest{

    CartPage CP;
    ProductsPage PP;
    @BeforeMethod
    public void preConditions(){

        CP=new CartPage(driver);
        PP=new ProductsPage(driver);
    }
    @Test(description = "Verify Subscription in Cart page")
    public void subscription(){
        HP.clickCart();
        assertTrue(CP.isSubscriptionTextVisible());
        CP.subscriptionSteps("naghamabdelrahman15@gmail.com");

    }
    @Test(description = "Verify adding Products in Cart")
    public void addProductToCart(){
        HP.clickProducts();
        PP.hoverOverFirstProduct();
        PP.clickAddToCartButtonForProductOne();
        PP.clickContinueShoppingButton();
        PP.hoverOverSecondProduct();
        PP.clickAddToCartButtonForProductTwo();
        PP.clickViewCart();
        assertTrue(CP.isProductOneDisplayed());
        assertTrue(CP.isProductTwoDisplayed());
    }
}
