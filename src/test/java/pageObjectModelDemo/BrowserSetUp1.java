package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp1 {

    public WebDriver driver;

    public void chromeBrowser(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/index.html");

    }
}