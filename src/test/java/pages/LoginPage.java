package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        System.out.println("Login Page"+driver);
        this.driver=driver;
    }

    public void loginApplication(String username,String password){
        System.out.println(username+" "+password);

        By usernameLoc= By.id("user-name");
        WebElement usernameEle= driver.findElement(usernameLoc);
        usernameEle.sendKeys(username);

        By passwordLoc=By.id("password");
        WebElement passwordEle= driver.findElement(passwordLoc);
        passwordEle.sendKeys(password);

        By loginLoc=By.xpath("//input[@type='submit']");
        WebElement loginEle=driver.findElement(loginLoc);
        loginEle.click();

    }

}
