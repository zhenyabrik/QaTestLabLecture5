package myprojects.automation.adminPages;

import org.openqa.selenium.By;

public class DashboardPage {

    //locators
//    private static By userAvatar = By.id("employee_infos");
    private static By userAvatar = By.xpath(".//*[@id='employee_infos']/a/span/img");
    private static By logoutButton = By.id("header_logout");
    private static By pageTitle = By.cssSelector(".page-title");
    private static By contentBlock = By.id("contentBlock");
    private static By Loader = By.id("ajax_running");

    //menu items
    private static By dashboardItem = By.id("tab-AdminDashboard");
    private static By dashboardItemFormCatalogItem = By.xpath("html/body/nav/ul/li[1]/a");
    private static By ordersItem = By.id("subtab-AdminParentOrders");
    private static By catalogItem = By.id("subtab-AdminCatalog");
    private static By customersItem = By.id("subtab-AdminParentCustomer");
    private static By supportItem = By.id("subtab-AdminParentCustomerThreads");
    private static By statisticItem = By.id("subtab-AdminStats");
    private static By productsSubItem = By.xpath(".//*[@id='subtab-AdminProducts']/a");

    //variables
    private static String dashboardHeader = "Пульт";
    private static String ordersHeader = "Заказы";
    private static String catalogHeader = "товары";
    private static String customersHeader = "Управление клиентами";
    private static String supportHeader = "Customer Service";
    private static String statisticHeader = "Статистика";

    //getters
    public static By getDashboardItemFormCatalogItem() {
        return dashboardItemFormCatalogItem;
    }
    public static By getLoader() {
        return Loader;
    }
    public static By getContentBlock() {
        return contentBlock;
    }
    public static By getProductsSubItem() {
        return productsSubItem;
    }
    public static By getUserAvatar() {
        return userAvatar;
    }
    public static By getLogoutButton() {
        return logoutButton;
    }
    public static By getPageTitle() {
        return pageTitle;
    }
    public static By getDashboardItem() {
        return dashboardItem;
    }
    public static By getOrdersItem() {
        return ordersItem;
    }
    public static By getCatalogItem() {
        return catalogItem;
    }
    public static By getCustomersItem() {
        return customersItem;
    }
    public static By getSupportItem() {
        return supportItem;
    }
    public static By getStatisticItem() {
        return statisticItem;
    }
    public static String getDashboardHeader() {
        return dashboardHeader;
    }
    public static String getOrdersHeader() {
        return ordersHeader;
    }
    public static String getCatalogHeader() {
        return catalogHeader;
    }
    public static String getCustomersHeader() {
        return customersHeader;
    }
    public static String getSupportHeader() {
        return supportHeader;
    }
    public static String getStatisticHeader() {
        return statisticHeader;
    }
}
