package swagLabsPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomateProductAddToCartInSauceLabs extends BrowserSetUp {
    @Test
    @Parameters({"usernameOfUser","passwordOfUser"})
    public void automateProductAddToCart(String usernameOfUser,String passwordOfUser ) {
        //String usernameOfUser="standard_user",passwordOfUser="secret_sauce";
        LocatorsAutomateAddToCart locatorsAutomateAddToCart = new LocatorsAutomateAddToCart(driver);
        driver.get("https://www.saucedemo.com/index.html");
        locatorsAutomateAddToCart.typeUsername(usernameOfUser);
        locatorsAutomateAddToCart.typePassword(passwordOfUser);
        locatorsAutomateAddToCart.clickLoginButton();
        locatorsAutomateAddToCart.clickAddToCart();
        locatorsAutomateAddToCart.clickCartContainer();
        locatorsAutomateAddToCart.identifyBackPackOnCart();
        locatorsAutomateAddToCart.browserTerminate();


    }
}
