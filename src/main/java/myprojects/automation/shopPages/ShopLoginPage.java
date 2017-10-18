package myprojects.automation.shopPages;

import org.openqa.selenium.By;

/**
 * Created by PC on 17.10.2017.
 */
public class ShopLoginPage {
    //locators
    private static By loginLink = By.xpath(".//*[@title='Войти в учетную запись']");
    private static By emailInput = By.xpath(".//*[@class='form-control'][@name='email']");
    private static By passwordInput = By.xpath(".//*[@class='form-control js-child-focus js-visible-password'][@name='password']");
    private static By loginButton = By.xpath(".//button[@class='btn btn-primary']");

    public static By getLoginLink() {
        return loginLink;
    }
    public static By getEmailInput() {
        return emailInput;
    }
    public static By getPasswordInput() {
        return passwordInput;
    }
    public static By getLoginButton() {
        return loginButton;
    }
}
