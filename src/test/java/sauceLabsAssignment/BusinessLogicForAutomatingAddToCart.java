package sauceLabsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessLogicForAutomatingAddToCart extends ExecutableForAutomatingAddToCart {
    private String username,password;
    BusinessLogicForAutomatingAddToCart(String username1,String password1) {
        this.username = username1;
        this.password = password1;
    }
    public String login() throws InterruptedException {
        chromeBrowser();
        driver.get("https://www.saucedemo.com/index.html");

        driver.findElement((By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]"))).clear();
        driver.findElement((By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]"))).sendKeys(username);

        driver.findElement((By.cssSelector("#password"))).clear();
        driver.findElement((By.cssSelector("#password"))).sendKeys(password);

        driver.findElement(By.cssSelector("#login-button")).click();
        addTheProductToCart();
        return  "Automating Add To Cart Feature Is Done Successfully";
    }
    private void addTheProductToCart() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
        identifyProductInCart();
    }
    private void identifyProductInCart() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div")));
        Thread.sleep(2000);
        System.out.println("Item located In Cart");
        browserTerminator();
    }
    private void browserTerminator(){

        driver.quit();

    }
}