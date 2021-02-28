package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    WebDriver driver;

    public  InventoryPage(WebDriver driver){
        System.out.println("Page Driver"+driver);
        this.driver=driver;
    }

    public void addProductToCart(String ProductName){
        By cartElementLoc= By.xpath("//*[text()='"+ProductName+"']/../../following-sibling::div/button");
        WebElement cartElement=driver.findElement(cartElementLoc);
        cartElement.click();
    }
    public void clickCartContainer(){
        By cartContainerLoc=By.cssSelector("path[fill='currentColor']");
        WebElement cartContainerEle=driver.findElement(cartContainerLoc);
        cartContainerEle.click();
    }


}
