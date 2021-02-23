package sauceLabsAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserSetUp {

    public WebDriver driver;
@BeforeMethod
    public void chromeBrowser(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        driver=new ChromeDriver();

        driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/index.html");

    }
}

