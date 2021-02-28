package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BrowserSetup {
    public WebDriver driver;

    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        System.out.println("CHECKPOINT-->"+driver);

        System.out.println("Launching Chrome Browser");

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

    }
}
