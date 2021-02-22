package sauceLabsAssignment;

import org.testng.annotations.Test;

public class ExecutableForAutomatingAddToCart extends BrowserSetUp {
    @Test
    public void automatingAddToCart() throws InterruptedException {

        BusinessLogicForAutomatingAddToCart businessLogicForAutomatingAddToCart=new BusinessLogicForAutomatingAddToCart("standard_user","secret_sauce");

        System.out.println(businessLogicForAutomatingAddToCart.login());
        System.out.println(businessLogicForAutomatingAddToCart.addTheProductToCart());
        System.out.println(businessLogicForAutomatingAddToCart.identifyProductInCart());
        System.out.println(businessLogicForAutomatingAddToCart.browserTerminator());
    }
}