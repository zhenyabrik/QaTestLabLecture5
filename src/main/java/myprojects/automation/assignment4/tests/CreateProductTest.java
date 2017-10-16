package myprojects.automation.assignment4.tests;

import myprojects.automation.BaseScript;

import myprojects.automation.GeneralActions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateProductTest extends BaseScript {

    @Test
    public void createNewProduct() throws InterruptedException {
        GeneralActions.loginAction();
        GeneralActions.moveToProductsPage();
        GeneralActions.createProduct();
        GeneralActions.moveToMainPage();
        GeneralActions.moveToProductsPage();
        GeneralActions.checkProduct();
        GeneralActions.moveToMainPage();
        GeneralActions.logoutAction();
        Reporter.log("Tests Result:");
    }
}
