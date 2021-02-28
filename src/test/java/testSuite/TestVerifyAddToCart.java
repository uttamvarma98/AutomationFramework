package testSuite;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;
import utilities.BrowserSetup;

public class TestVerifyAddToCart extends BrowserSetup {

    @Test
    public void test001_VerifyCart(){

        String username="standard_user",password ="secret_sauce";

        System.out.println(driver);

        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginApplication(username,password);

        InventoryPage inventoryPage=new InventoryPage(driver);
        String productName="Sauce Labs Backpack";
        inventoryPage.addProductToCart(productName);
        inventoryPage.addProductToCart("Sauce Labs Bike Light");
        //inventoryPage.addProductToCart("Sauce Labs Onesie");
        inventoryPage.clickCartContainer();

        CartPage cartPage=new CartPage(driver);
        String verifyProduct="Sauce Labs Backpack";
        cartPage.verifyProduct(verifyProduct);
        cartPage.verifyProduct("Sauce Labs Bike Light");
        cartPage.verifyProduct("Sauce Labs Onesie");

    }
}
