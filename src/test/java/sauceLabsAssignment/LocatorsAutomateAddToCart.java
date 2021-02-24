package sauceLabsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsAutomateAddToCart {
    WebDriver driver;
    By user_name=By.id("user-name");
    By pass_word=By.id("password");
    By loginButton=By.xpath("//input[@type='submit']");
    By addToCart=By.xpath("//div[@id=\"inventory_container\"]/div/div[1]//button");
    By cartContainer=By.cssSelector("path[fill='currentColor']");
    By backPack=By.xpath("//div[@class='inventory_item_name']");

    public LocatorsAutomateAddToCart(WebDriver driver){
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
