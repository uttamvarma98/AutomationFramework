package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;

    public  CartPage(WebDriver driver){
        System.out.println("CartPage Driver"+driver);
        this.driver=driver;
    }
    public void verifyProduct(String productName){
        WebDriverWait wait=new WebDriverWait(driver,30);
        try {
            By cartContainerLoc = By.xpath("//*[text()='" + productName + "']");
            wait.until(ExpectedConditions.presenceOfElementLocated(cartContainerLoc));
        }
        catch (Exception e){
            System.out.println(productName+" product is not found");
        }
    }
}
