package pageObjectModelDemo;

import org.testng.annotations.Test;


public class ExecutableForAutomatingAddToCart1 extends BrowserSetUp1 {
    @Test
    public void executable() throws InterruptedException {
        BusinessLogicForAutomatingAddToCart1 businessLogicForAutomatingAddToCart1 = new BusinessLogicForAutomatingAddToCart1();
        System.out.println(businessLogicForAutomatingAddToCart1.businessLogic());
    }
}
