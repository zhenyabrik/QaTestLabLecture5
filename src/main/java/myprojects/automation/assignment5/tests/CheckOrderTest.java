package myprojects.automation.assignment5.tests;

import myprojects.automation.BaseScript;
import myprojects.automation.GeneralActionsShop;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by PC on 17.10.2017.
 */
public class CheckOrderTest extends BaseScript {

    @Test
    public void createNewOrder(){
        GeneralActionsShop.shopLoginAction();
        GeneralActionsShop.navigateToAllProductsPage();
        GeneralActionsShop.openFirstProductPage();
        GeneralActionsShop.addToCartAction();
        GeneralActionsShop.checkOrderDetailsAction();
        GeneralActionsShop.createOrederAction();
        GeneralActionsShop.fillPersonalInfoAction();
        GeneralActionsShop.fillDeliveryDataAction();
        GeneralActionsShop.fillPaymentDataAction();
        GeneralActionsShop.checkConfirmationOrderDetailsAction();
        GeneralActionsShop.returnToProductPageAndCheckCountAction();


        Reporter.log("Tests Result:");
    }
}
