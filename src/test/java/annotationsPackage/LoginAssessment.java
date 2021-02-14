package annotationsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginAssessment {


    @Test(dataProvider = "TestData")
    public void loginCredentials(String user, String pass) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/index.html");

        //  driver.findElement(By.tagName("Username")).click();

        driver.findElement((By.xpath("//input[@name='user-name']"))).clear();
        driver.findElement((By.xpath("//input[@name='user-name']"))).sendKeys(user);

        driver.findElement((By.xpath("//input[@name='password']"))).clear();
        driver.findElement((By.xpath("//input[@name='password']"))).sendKeys(pass);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        /*WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']")));*/

        Thread.sleep(4000);

        driver.close();

    }

    @DataProvider(name = "TestData")
    public Object[][] getData() {
        Object[][] SwagLabs = {{"standard_user", "secret_sauce"}};
        return SwagLabs;
    }

}