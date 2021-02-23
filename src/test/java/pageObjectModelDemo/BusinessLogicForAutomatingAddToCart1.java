package pageObjectModelDemo;


public class BusinessLogicForAutomatingAddToCart1 extends ExecutableForAutomatingAddToCart1 {

    {
        chromeBrowser();
    }

    LocatorsOfSauceLabs locatorsOfSauceLabs = new LocatorsOfSauceLabs(driver);
    public String businessLogic() throws InterruptedException {

        locatorsOfSauceLabs.typeUserName("standard_user");

        locatorsOfSauceLabs.typePassword("secret_sauce");

        locatorsOfSauceLabs.clickTheButton();

        return "Automating product add to cart is done successfully";

    }
      public String addProductToCart() {

          locatorsOfSauceLabs.clickAddTheProductToCartButton();
          locatorsOfSauceLabs.click_shopping_cart_container();
          return "Added product to cart";
      }
      public String identifyProductInCart() throws InterruptedException {
          locatorsOfSauceLabs.identifiesProductInCart();
          return "Product identified in the cart";
      }
      public String browserTerminate() {
          locatorsOfSauceLabs.browserTerminator();
          return "closes the browser";
      }




}