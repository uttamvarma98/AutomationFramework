package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BusinessLogicForAutomatingAddToCart  {
    WebDriver driver;

    @Test
    public void businessLogic() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        driver=new ChromeDriver();
        LocatorsOfSauceLabs locatorsOfSauceLabs=new LocatorsOfSauceLabs(driver);


        driver.manage().window().maximize();



        locatorsOfSauceLabs.typeUserName("standard_user");

        locatorsOfSauceLabs.typePassword("secret_sauce");

        locatorsOfSauceLabs.clickTheButton();


        locatorsOfSauceLabs.clickAddTheProductToCartButton();
        locatorsOfSauceLabs. click_shopping_cart_container();

        locatorsOfSauceLabs.identifiesProductInCart();


        locatorsOfSauceLabs.browserTerminator();


    }

}