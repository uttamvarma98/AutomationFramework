package sauceLabsAssignment;

import org.testng.annotations.Test;

public class AutomateProductAddToCartInSauceLabs extends BrowserSetUp {
    @Test
    public void automateProductAddToCart() {
        LocatorsAutomateAddToCart locatorsAutomateAddToCart = new LocatorsAutomateAddToCart(driver);
        locatorsAutomateAddToCart.typeUsername("standard_user");
        locatorsAutomateAddToCart.typePassword("secret_sauce");
        locatorsAutomateAddToCart.clickLoginButton();
        locatorsAutomateAddToCart.clickAddToCart();
        locatorsAutomateAddToCart.clickCartContainer();
        locatorsAutomateAddToCart.identifyBackPackOnCart();
        locatorsAutomateAddToCart.browserTerminate();
    }
}
