package myprojects.automation;

import myprojects.automation.shopPages.*;
import myprojects.automation.utils.Properties;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

/**
 * Created by PC on 17.10.2017.
 */
public class GeneralActionsShop extends BaseScript {

    public static void openShopAction(){
        getConfiguredDriver().get(Properties.getBaseUrl());
        wait.until(ExpectedConditions.elementToBeClickable(MainPage.getMainBlock()));
    }
    public static void navigateToAllProductsPage(){
        getConfiguredDriver().findElement(MainPage.getLogo()).click();
        wait.until(ExpectedConditions.elementToBeClickable(MainPage.getAllProductsLink()));
        getConfiguredDriver().findElement(MainPage.getAllProductsLink()).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProductsPage.getProductsBlock()));
    }
    public static void openFirstProductPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ProductsPage.getFirstProduct()));
        getConfiguredDriver().findElement(ProductsPage.getFirstProductName()).click();
        wait.until(ExpectedConditions.elementToBeClickable(MainPage.getMainBlock()));
    }
    public static void addToCartAction(){
        getConfiguredDriver().findElement(ProductsPage.getAddToCartButton()).click();
        getConfiguredDriver().findElement(ProductsPage.getModalWindow()).isDisplayed();
        getConfiguredDriver().findElement(ProductsPage.getProccedCheckoutButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(CartPage.getCartBlock()));
    }
    public static void checkOrderDetailsAction(){
        Assert.assertEquals(getConfiguredDriver().findElement(CartPage.getOrderProductCount()).
                getAttribute("value"), CartPage.convertProductCountToString());
        Assert.assertEquals(getConfiguredDriver().findElement(CartPage.getOrderProductName()).
                getAttribute("alt"), CartPage.getProductNameValue());
        Assert.assertEquals(getConfiguredDriver().findElement(CartPage.getOrderProductPrice()).getText(),
                CartPage.getProductPriceValue());
    }
    public static void createOrederAction(){
        getConfiguredDriver().findElement(CartPage.getCreateOrderButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(OrderPage.getPersonalInfoBlock()));
    }
    public static void fillPersonalInfoAction(){
        getConfiguredDriver().findElement(OrderPage.getCustomerFirstNameInput()).sendKeys(OrderPage.getFirstName());
        getConfiguredDriver().findElement(OrderPage.getCustomerLastNameInput()).sendKeys(OrderPage.getLastName());
        getConfiguredDriver().findElement(OrderPage.getCustomerEmailInput()).sendKeys(OrderPage.email);
        wait.until(ExpectedConditions.elementToBeClickable(OrderPage.getInfoContinueButton()));
        getConfiguredDriver().findElement(OrderPage.getInfoContinueButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(OrderPage.getPaymentsBlock()));
    }
    public static void fillDeliveryDataAction(){
        getConfiguredDriver().findElement(OrderPage.getAdressInput()).sendKeys(OrderPage.adress);
        getConfiguredDriver().findElement(OrderPage.getPostcodeInput()).sendKeys(String.valueOf(OrderPage.postcode));
        getConfiguredDriver().findElement(OrderPage.getCityInput()).sendKeys(OrderPage.city);
        getConfiguredDriver().findElement(OrderPage.getAdressContinueButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(OrderPage.getDeliveryBlock()));
        getConfiguredDriver().findElement(OrderPage.getDeliveryContinueButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(OrderPage.getPaymentBlock()));
    }
    public static void fillPaymentDataAction(){
        getConfiguredDriver().findElement(OrderPage.getPaymentByCheckRadioButton()).click();
        getConfiguredDriver().findElement(OrderPage.getTermsAndConditionsCheckbox()).click();
        getConfiguredDriver().findElement(OrderPage.getOrderAndPaymentButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(OrderPage.getOrderConfirmationBlock()));
    }
    public static void checkConfirmationOrderDetailsAction(){
        Assert.assertEquals(getConfiguredDriver().findElement(OrderPage.getOrderConfirmationMessageBlock()).getText(),
                OrderPage.getOrderConfirmationMessage());
//        Assert.assertEquals(getConfiguredDriver().findElement(OrderPage.getConfirmedOrderProductName()).getText(),
//                CartPage.getProductNameValue());
        Assert.assertEquals(getConfiguredDriver().findElement(OrderPage.getConfirmedOrderProductCount()).getText(),
                CartPage.convertProductCountToString());
        Assert.assertEquals(getConfiguredDriver().findElement(OrderPage.getConfirmedOrderProductPrice()).getText(),
                CartPage.getProductPriceValue());
    }
    public static void returnToProductPageAndCheckCountAction(){
    }
}
