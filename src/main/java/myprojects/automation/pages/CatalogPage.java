package myprojects.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogPage {

    //locators
    private static By categorySubItem = By.id("subtab-AdminCategories");
    private static By addCategoryButton = By.id("page-header-desc-category-new_category");
    private static By newCategoryNameInput = By.id("name_1");
    private static By saveCategoryButton = By.id("category_form_submit_btn");
    private static By succesSaveCategoryMessageBlock = By.cssSelector(".alert.alert-success");
    private static By categoryNameCaretDownIcon = By.xpath(".//*[@id='table-category']/thead/tr[1]/th[3]/span/a[1]/i");
    private static By categoryTableBody = By.cssSelector("#table-category>tbody");

    //variables
    private static String categoryName = "new category";
    private static String categoryName2 = "xxx";
    private static String succesSaveCategoryMessage = "Создано";

    //getters
    public static By getCategorySubItem() {
        return categorySubItem;
    }
    public static By getAddCategoryButton() {
        return addCategoryButton;
    }
    public static By getNewCategoryNameInput() {
        return newCategoryNameInput;
    }
    public static By getSaveCategoryButton() {
        return saveCategoryButton;
    }
    public static By getSuccesSaveCategoryMessageBlock() {
        return succesSaveCategoryMessageBlock;
    }
    public static By getCategoryNameCaretDownIcon() {
        return categoryNameCaretDownIcon;
    }
    public static By getCategoryTableBody() {
        return categoryTableBody;
    }
    public static String getCategoryName() {
        return categoryName;
    }
    public static String getCategoryName2() {
        return categoryName2;
    }
    public static String getSuccesSaveCategoryMessage() {
        return succesSaveCategoryMessage;
    }
}
