package swagLabsPackage1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomateProductAddToCartInSauceLabs extends BrowserSetUp {
    @Test
    @Parameters({"usernameOfUser","passwordOfUser"})
    public void automateProductAddToCart(String usernameOfUser,String passwordOfUser ) {
        //String usernameOfUser="standard_user",passwordOfUser="secret_sauce";
        LocatorsAutomateAddToCart1 locatorsAutomateAddToCart = new LocatorsAutomateAddToCart1(driver);
        driver.get("https://www.saucedemo.com/");
        locatorsAutomateAddToCart.typeUsername(usernameOfUser);
        locatorsAutomateAddToCart.typePassword(passwordOfUser);
        locatorsAutomateAddToCart.clickLoginButton();
        locatorsAutomateAddToCart.clickAddToCart();
        locatorsAutomateAddToCart.clickCartContainer();
        locatorsAutomateAddToCart.identifyBackPackOnCart();
        locatorsAutomateAddToCart.browserTerminate();


    }
}
