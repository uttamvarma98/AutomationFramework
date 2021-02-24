package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsOfSauceLabs  {

    WebDriver driver;
    By username=By.id("user-name");
    By password=By.id("password");
    By loginButton=By.xpath("//input[@type='submit']");

    public LocatorsOfSauceLabs(WebDriver driver){
        this.driver=driver;
    }
    public void typeUserName(){

        driver.findElement(username).sendKeys("standard_user");
    }
    public void typePassword(){

        driver.findElement(password).sendKeys("secret_sauce");
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
