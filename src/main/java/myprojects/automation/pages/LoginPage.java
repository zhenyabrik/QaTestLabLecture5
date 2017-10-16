package myprojects.automation.pages;

import myprojects.automation.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

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

    //variables
    private static String login = "webinar.test@gmail.com";
    private static String password = "Xcg7299bnSmMuRLp9ITw";

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
    public static String getLogin() {
        return login;
    }
    public static String getPassword() {
        return password;
    }
}
