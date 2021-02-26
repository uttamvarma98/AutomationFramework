package swagLabsPackage;

import org.testng.annotations.Test;

public class AutomateProductAddToCartInSwagLabs extends TestDataOfSwagLabs {
    @Test

    public void automateProductAddToCart() {
        //String usernameOfUser="standard_user",passwordOfUser="secret_sauce";
        LocatorsAutomateAddToCart locatorsAutomateAddToCart = new LocatorsAutomateAddToCart(driver);

        locatorsAutomateAddToCart.typeUsername(username);
        locatorsAutomateAddToCart.typePassword(password);
        locatorsAutomateAddToCart.clickLoginButton();
        locatorsAutomateAddToCart.clickAddToCart();
        locatorsAutomateAddToCart.clickCartContainer();
        locatorsAutomateAddToCart.identifyBackPackOnCart();
        locatorsAutomateAddToCart.clickRemoveButton();
        locatorsAutomateAddToCart.clickContinueShoppingButton();
        locatorsAutomateAddToCart.findProductsPage();
        locatorsAutomateAddToCart.browserTerminate();
    }
}