package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sauceLabsAssignment.BrowserSetUp;

@Test
public class LoginPageOfSauceLabs extends BrowserSetUp {
    //WebDriver driver;
    public void verifyValidLogin(){
       /* System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        */
        LocatorsOfSauceLabs locatorsOfSauceLabs=new LocatorsOfSauceLabs(driver);
        locatorsOfSauceLabs.typeUserName();
        locatorsOfSauceLabs.typePassword();
        locatorsOfSauceLabs.clickLoginButton();
        driver.quit();
    }
}
