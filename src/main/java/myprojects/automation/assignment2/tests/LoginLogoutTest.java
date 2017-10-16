package myprojects.automation.assignment2.tests;

import myprojects.automation.BaseScript;
import myprojects.automation.GeneralActions;
import myprojects.automation.pages.DashboardPage;
import myprojects.automation.pages.LoginPage;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

/**
 * Created by PC on 04.10.2017.
 */
public class LoginLogoutTest extends BaseScript {

    @Test
    public void loginLogoutTest(){
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = getConfiguredDriver();
//        EventFiringWebDriver driver = getConfiguredDriver();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.loginAction();
//
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        dashboardPage.logoutAction();
//
//        driverQuit(driver);

        GeneralActions.loginAction();
        GeneralActions.logoutAction();
    }
}
