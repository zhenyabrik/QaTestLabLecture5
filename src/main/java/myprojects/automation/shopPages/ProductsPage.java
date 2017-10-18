package myprojects.automation.shopPages;

import org.openqa.selenium.By;

/**
 * Created by PC on 17.10.2017.
 */
public class ProductsPage {

    private static By productsBlock = By.id("products");
    private static By firstProduct = By.xpath(".//*[@id='js-product-list']/div[1]/article[1]/div");
    private static By firstProductName = By.xpath(".//*[@id='js-product-list']/div[1]/article[1]/div/div[1]/h1/a");

    private static By addToCartButton = By.cssSelector(".btn.btn-primary.add-to-cart");
    private static By modalWindow = By.cssSelector(".modal-content");
//    private static By proccedCheckoutButton = By.cssSelector(".btn.btn-primary");
    private static By proccedCheckoutButton = By.xpath(".//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/a");

    public static By getProductsBlock() {
        return productsBlock;
    }

    public static By getFirstProduct() {
        return firstProduct;
    }

    public static By getFirstProductName() {
        return firstProductName;
    }

    public static By getAddToCartButton() {
        return addToCartButton;
    }

    public static By getModalWindow() {
        return modalWindow;
    }

    public static By getProccedCheckoutButton() {
        return proccedCheckoutButton;
    }
}
