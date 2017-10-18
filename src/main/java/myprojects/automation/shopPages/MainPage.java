package myprojects.automation.shopPages;

import org.openqa.selenium.By;

/**
 * Created by PC on 17.10.2017.
 */
public class MainPage {

    //locators
    private static By mainBlock = By.id("wrapper");
    private static By allProductsLink = By.cssSelector(".all-product-link.pull-xs-left.pull-md-right.h4");
    private static By logo = By.cssSelector(".logo.img-responsive");

    public static By getMainBlock() {
        return mainBlock;
    }
    public static By getAllProductsLink() {
        return allProductsLink;
    }
    public static By getLogo() {
        return logo;
    }
}
