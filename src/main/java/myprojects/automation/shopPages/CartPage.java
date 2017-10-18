package myprojects.automation.shopPages;

import org.openqa.selenium.By;

/**
 * Created by PC on 17.10.2017.
 */
public class CartPage {

    private static By cartBlock = By.cssSelector(".card.cart-container");
    private static By productName = By.xpath(".//*[@class='h1'][@itemprop='name']");
    private static By productPrice = By.xpath(".//*[@itemprop='price']");
    private static By orderProductCount = By.cssSelector(".js-cart-line-product-quantity.form-control");
    private static By orderProductPrice = By.xpath(".//*[@class='product-price']");
    private static By orderProductName = By.cssSelector(".product-image.media-middle>img");
    private static By createOrderButton = By.xpath(".//*[@class='btn btn-primary']");

    private static int productCountValue = 1;
    private static String productNameValue = "Faded Short Sleeve T-shirts";
    private static String productPriceValue = "16,51 ₴";

    public static String convertProductCountToString(){
        int i = productCountValue;
        String productCountStr = "" + i;
        return productCountStr;
    }
    public static By getCartBlock() {
        return cartBlock;
    }
    public static By getOrderProductCount() {
        return orderProductCount;
    }
    public static By getOrderProductPrice() {
        return orderProductPrice;
    }
    public static By getOrderProductName() {
        return orderProductName;
    }
    public static int getCount() {
        return productCountValue;
    }
    public static By getProductName() {
        return productName;
    }
    public static By getProductPrice() {
        return productPrice;
    }
    public static int getProductCountValue() {
        return productCountValue;
    }
    public static String getProductNameValue() {
        return productNameValue;
    }
    public static String getProductPriceValue() {
        return productPriceValue;
    }
    public static By getCreateOrderButton() {
        return createOrderButton;
    }
}
