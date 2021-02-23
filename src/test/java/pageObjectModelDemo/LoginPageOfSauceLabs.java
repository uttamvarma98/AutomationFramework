package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LoginPageOfSauceLabs {
    WebDriver driver;
    public void verifyValidLogin(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");
        LocatorsOfSauceLabs locatorsOfSauceLabs=new LocatorsOfSauceLabs(driver);
        locatorsOfSauceLabs.typeUserName();
        locatorsOfSauceLabs.typePassword();
        locatorsOfSauceLabs.clickLoginButton();
        driver.quit();
    }
}
