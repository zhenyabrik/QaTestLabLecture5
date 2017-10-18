package myprojects.automation;

import myprojects.automation.assignment4.model.ProductData;
import myprojects.automation.adminPages.DashboardPage;
import myprojects.automation.adminPages.LoginPage;
import myprojects.automation.adminPages.ProductPage;
import myprojects.automation.utils.Constants;
import myprojects.automation.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GeneralActions extends BaseScript{

//    static WebDriverWait wait = new WebDriverWait(getConfiguredDriver(), 5);

    public static void loginAction(){
        getConfiguredDriver().get(Properties.getBaseAdminUrl());
        getConfiguredDriver().findElement(LoginPage.getEmailInput()).isDisplayed();
        getConfiguredDriver().findElement(LoginPage.getEmailInput()).sendKeys(Constants.getAdminLogin());
        getConfiguredDriver().findElement(LoginPage.getPasswordInput()).sendKeys(Constants.getAdminPassword());
        getConfiguredDriver().findElement(LoginPage.getLoginButton()).click();
//        throw new UnsupportedOperationException();
    }
    public static void logoutAction() {
        wait.until(ExpectedConditions.elementToBeClickable(DashboardPage.getUserAvatar()));
        getConfiguredDriver().findElement(DashboardPage.getUserAvatar()).click();
        wait.until(ExpectedConditions.elementToBeClickable(DashboardPage.getLogoutButton()));
        getConfiguredDriver().findElement(DashboardPage.getLogoutButton()).click();
//        throw new UnsupportedOperationException();
    }
    public static void moveToProductsPage(){
        WebElement productSubMenuElement = getConfiguredDriver().findElement(DashboardPage.getCatalogItem());
        Actions actions = new Actions(getConfiguredDriver());
        actions.moveToElement(productSubMenuElement).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(DashboardPage.getProductsSubItem()));
        productSubMenuElement.findElement(DashboardPage.getProductsSubItem()).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProductPage.getAddNewProductButton()));
    }

    public static void moveToMainPage(){
        getConfiguredDriver().findElement(DashboardPage.getDashboardItemFormCatalogItem()).click();
        wait.until(ExpectedConditions.elementToBeClickable(DashboardPage.getCatalogItem()));
    }

    public static void createProduct(){
        getConfiguredDriver().findElement(ProductPage.getAddNewProductButton()).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProductPage.getProductNameInput()));

//        getConfiguredDriver().findElement(ProductPage.getProductNameInput()).sendKeys(ProductData.generate().getName());
        getConfiguredDriver().findElement(ProductPage.getProductNameInput()).sendKeys(ProductData.getName2());

//        getConfiguredDriver().findElement(ProductPage.getProductCountValue()).sendKeys(ProductData.generate().getQty().toString());
        getConfiguredDriver().findElement(ProductPage.getProductCount()).sendKeys(String.valueOf(ProductData.getCount2()));

        wait.until(ExpectedConditions.elementToBeClickable(ProductPage.getProductPrice()));
        BaseScript.driver.findElement(By.xpath(".//*[@id='form_step1_price_shortcut']")).clear();
//        getConfiguredDriver().findElement(ProductPage.getProductPrice()).sendKeys(ProductData.generate().getPrice().toString());
        getConfiguredDriver().findElement(ProductPage.getProductPrice()).sendKeys(String.valueOf(ProductData.getPrice2()));

        getConfiguredDriver().findElement(ProductPage.getProductSwitch()).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProductPage.getSaveSettingMessage()));
        getConfiguredDriver().findElement(ProductPage.getSaveSettingMessageCloseButton()).click();
        getConfiguredDriver().findElement(ProductPage.getSubmitButton()).click();
        getConfiguredDriver().findElement(ProductPage.getSaveSettingMessageCloseButton()).click();
    }

    public static void checkProduct() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(ProductPage.getIconProductCaretDown()));
        getConfiguredDriver().findElement(ProductPage.getIconProductCaretDown()).click();
        Thread.sleep(3000);
        BaseScript.driver.findElement(By.linkText(ProductData.name2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProductPage.getProductNameInput()));

        Assert.assertEquals(getConfiguredDriver().findElement(ProductPage.getProductNameInput()).
                getAttribute("value"), ProductData.name2);

        Assert.assertEquals(getConfiguredDriver().findElement(ProductPage.getProductCount()).
                getAttribute("value"),ProductData.convertCountToString());

        Assert.assertEquals(getConfiguredDriver().findElement(ProductPage.getProductPrice()).
                getAttribute("value"),ProductData.convertPricetToString());
    }
}
