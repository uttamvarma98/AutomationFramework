package annotationsPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsLearn {
    @Parameters({"browserName1","browserName2"})
    @Test
    public void test2(String browserName1,String browserName2 ) throws InterruptedException {
        if(browserName1.equalsIgnoreCase("ChromeBrowser")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
               /* WebDriverWait wait = new WebDriverWait(driver, 10);
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//[@display='block']")));*/
            Thread.sleep(3000);
            driver.close();
        }
        if(browserName2.equalsIgnoreCase("FireFoxBrowser")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            WebDriver driver1 = new FirefoxDriver();
            driver1.close();
        }
    }

}
