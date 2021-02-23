package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsOfSauceLabs extends BrowserSetUp1 {

    WebDriver driver;

    public LocatorsOfSauceLabs(WebDriver driver){
        this.driver=driver;
    }

    By user_name=By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]");
    By pass_word=By.cssSelector("#password");
    By login_button=By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]");

    By addTheProductToCartButton=By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");

    By shopping_cart_container=By.cssSelector("#shopping_cart_container > a > svg > path");

    By identifyProductInCart=By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div");


    public void typeUserName(String username){


        driver.findElement(user_name).clear();
        driver.findElement(user_name).sendKeys(username);
    }
    public void typePassword(String password){

        driver.findElement(pass_word).clear();

        driver.findElement(pass_word).sendKeys(password);
    }
    public void clickTheButton(){

        driver.findElement(login_button).click();
    }
    public void clickAddTheProductToCartButton(){

        driver.findElement(addTheProductToCartButton).click();
    }
    public void click_shopping_cart_container(){

        driver.findElement(shopping_cart_container).click();
    }
    public void identifiesProductInCart() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(identifyProductInCart));

        Thread.sleep(3000);

        //driver.findElement(identifyProductInCart);
    }
    public void browserTerminator(){
        driver.quit();

    }

}
