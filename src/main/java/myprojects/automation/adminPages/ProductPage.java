package myprojects.automation.adminPages;

import org.openqa.selenium.By;

public class ProductPage {

    //locators
    private static By addNewProductButton = By.cssSelector("#page-header-desc-configuration-add");
    private static By productNameInput = By.cssSelector("#form_step1_name_1");
    private static By productCount = By.cssSelector("#form_step1_qty_0_shortcut");
    private static By productPrice = By.cssSelector("#form_step1_price_shortcut");
    private static By productCatalogList = By.id("product_catalog_list");
    private static By iconProductCaretDown = By.xpath(".//*[@id='product_catalog_list']/div[2]/div/table/thead/tr[1]/th[3]/span[2]");

    private static By submitButton = By.cssSelector("#submit");
    private static By saveNewProductButton = By.cssSelector("#product_form_save_new_btn");
    private static By productSwitch = By.cssSelector(".switch-input");
    private static By saveSettingMessage = By.id("growls");
    private static By saveSettingMessageCloseButton = By.cssSelector(".growl-close");

    //getters
    public static By getIconProductCaretDown() {
        return iconProductCaretDown;
    }
    public static By getProductCatalogList() {
        return productCatalogList;
    }
    public static By getSaveSettingMessageCloseButton() {
        return saveSettingMessageCloseButton;
    }
    public static By getSaveSettingMessage() {
        return saveSettingMessage;
    }
    public static By getAddNewProductButton() {
        return addNewProductButton;
    }
    public static By getProductNameInput() {
        return productNameInput;
    }
    public static By getProductCount() {
        return productCount;
    }
    public static By getProductPrice() {
        return productPrice;
    }
    public static By getSubmitButton() {
        return submitButton;
    }
    public static By getSaveNewProductButton() {
        return saveNewProductButton;
    }
    public static By getProductSwitch() {
        return productSwitch;
    }
}
