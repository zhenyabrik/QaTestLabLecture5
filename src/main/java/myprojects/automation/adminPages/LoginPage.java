package myprojects.automation.adminPages;

import org.openqa.selenium.By;

public class LoginPage {

//    private EventFiringWebDriver driver;
//    //constructor
//    public LoginPage(EventFiringWebDriver driver){
//        this.driver = driver;
//    }

    //locators
    private static By emailInput = By.id("email");
    private static By passwordInput = By.id("passwd");
    private static By loginButton = By.cssSelector(".btn.btn-primary.btn-lg.btn-block.ladda-button");

    //getters
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
