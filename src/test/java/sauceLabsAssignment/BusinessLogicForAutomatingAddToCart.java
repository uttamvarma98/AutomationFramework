package sauceLabsAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessLogicForAutomatingAddToCart extends ExecutableForAutomatingAddToCart {
    private String username,password;
    BusinessLogicForAutomatingAddToCart(String username1,String password1) throws InterruptedException {
        if(username1.length()<=15&&password1.length()<=15) {
            this.username = username1;
            this.password = password1;
            //login();
        }
        else{
            System.out.println("Dear user please enter valid credentials");
            System.exit(1);
        }
    }
        public String login() throws InterruptedException {
        chromeBrowser();
        driver.get("https://www.saucedemo.com/index.html");

        driver.findElement((By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]"))).clear();
        driver.findElement((By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]"))).sendKeys(username);

        driver.findElement((By.cssSelector("#password"))).clear();
        driver.findElement((By.cssSelector("#password"))).sendKeys(password);

        driver.findElement(By.cssSelector("#login-button")).click();
        //addTheProductToCart();
        return  "Automating Add To Cart Is Done Successfully";
    }
    public String addTheProductToCart() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
        //identifyProductInCart();
        return "Product adding to cart is done successfully";
    }
    public String identifyProductInCart() throws InterruptedException{
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div")));
        Thread.sleep(2000);
        System.out.println("Item located In Cart");
       // browserTerminator();
        return "Product is identified in the cart";
    }
    public String browserTerminator(){

        driver.quit();
        return "Closed the browser succesfully";

    }
}