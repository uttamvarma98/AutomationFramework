package swagLabsPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BrowserSetUp {

    public WebDriver driver;
    @BeforeMethod
    @Parameters({"browser"})
    public void browserLaunch(String browser){
        if(browser.equalsIgnoreCase("ChromeBrowser")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }
        if(browser.equalsIgnoreCase("FirefoxBrowser")) {
            System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");

            driver = new FirefoxDriver();

            driver.manage().window().maximize();
        }

    }
}