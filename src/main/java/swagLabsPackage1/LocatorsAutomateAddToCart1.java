package swagLabsPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsAutomateAddToCart1 {
    WebDriver driver;
    By user_name=By.cssSelector("input[type='text']");
    By pass_word=By.id("password");
    By loginButton=By.xpath("//input[@type='submit']");
    By addToCart=By.xpath("//div[@id=\"inventory_container\"]/div/div[1]//button");
    By cartContainer=By.cssSelector("path[fill='currentColor']");
    By backPack=By.xpath("//div[@class='inventory_item_name']");
    By removeButton=By.xpath("//button[@class='btn_secondary cart_button']");
    By continueShoppingButton=By.xpath("//a[@class='btn_secondary']");
    By findProductsPage=By.cssSelector("div[class='peek']");


    public LocatorsAutomateAddToCart1(WebDriver driver){
        this.driver=driver;
    }
    public void typeUsername(String username){
        driver.findElement(user_name).sendKeys(username);
    }
    public void typePassword(String password){
        driver.findElement(pass_word).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clickAddToCart(){
        driver.findElement(addToCart).click();
    }
    public void clickCartContainer(){
        driver.findElement(cartContainer).click();
    }
    public void identifyBackPackOnCart(){
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(backPack));
    }
    public void browserTerminate(){
        driver.quit();
    }

}
