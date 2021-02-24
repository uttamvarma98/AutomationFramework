package pageObjectModelDemo;

import org.testng.annotations.Test;
import swagLabsPackage.BrowserSetUp;

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
