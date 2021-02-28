package swagLabsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LocatorsAutomateAddToCart {
    WebDriver driver;

    public LocatorsAutomateAddToCart(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }

    @FindBy(id = "user-name")
    @CacheLookup
    private WebElement user_name;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement pass_word;

    @FindBy(xpath = "//input[@type='submit']")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(how = How.XPATH,using = "//div[@id=\"inventory_container\"]/div/div[1]//button")
    @CacheLookup
    private WebElement addToCart;

    @FindBy(how=How.CSS,using = "path[fill='currentColor']")
    @CacheLookup
    private WebElement cartContainer;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    @CacheLookup
    private WebElement backPack;

    @FindBy(how=How.XPATH,using= "//button[@class='btn_secondary cart_button']")
    @CacheLookup
    private WebElement removeButton;

    @FindBy(how=How.XPATH,using= "//a[@class='btn_secondary']")
    @CacheLookup
    private WebElement continueShoppingButton;

    @FindBy(how=How.CSS,using = "div[class='peek']")
    @CacheLookup
    private WebElement findProductsPage;

    public void typeUsername(String username){

        driver.get("https://www.saucedemo.com/");
        user_name.sendKeys(username);

    }
    public void typePassword(String password){

        pass_word.sendKeys(password);
    }
    public void clickLoginButton(){

        loginButton.click();

    }
    public void clickAddToCart(){

        addToCart.click();
    }
    public void clickCartContainer(){

        cartContainer.click();
    }
    public void identifyBackPackOnCart(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        try {

            wait.until(ExpectedConditions.presenceOfElementLocated((By) backPack));
        }
        catch (Exception e){
            By backPack=By.xpath("//div[@class='inventory_item_name']");
            wait.until(ExpectedConditions.presenceOfElementLocated(backPack));
        }

    }
    public void clickRemoveButton(){

        removeButton.click();
    }
    public void clickContinueShoppingButton(){

        continueShoppingButton.click();
    }
    public void findProductsPage(){
        WebDriverWait wait=new WebDriverWait(driver,30);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By) findProductsPage));
        }
        catch (Exception e){
            By findProductsPage=By.cssSelector("div[class='peek']");
            wait.until(ExpectedConditions.presenceOfElementLocated(findProductsPage));
        }
    }
    public void browserTerminate(){
        driver.quit();
    }

}