package myprojects.automation.shopPages;

import org.openqa.selenium.By;
import java.util.Random;

/**
 * Created by PC on 17.10.2017.
 */
public class OrderPage {

    private static By personalInfoBlock = By.id("checkout-personal-information-step");
    private static By customerFirstNameInput = By.xpath(".//*[@class='form-control'][@name='firstname']");
    private static By customerLastNameInput = By.xpath(".//*[@class='form-control'][@name='lastname']");
    private static By customerEmailInput = By.xpath(".//*[@class='form-control'][@name='email']");
    private static By infoContinueButton = By.xpath(".//*[@class='continue btn btn-primary pull-xs-right'][@type='submit']");
    private static By adressContinueButton = By.xpath(".//*[@id='delivery-address']/div/footer/button");
    private static By deliveryContinueButton = By.xpath(".//*[@id='js-delivery']/button");
    private static By paymentsBlock = By.id("checkout-payment-step");
    private static By deliveryBlock = By.id("checkout-delivery-step");
    private static By paymentBlock = By.id("checkout-payment-step");

    private static By adressInput = By.xpath(".//*[@class='form-control'][@name='address1']");
    private static By postcodeInput = By.xpath(".//*[@class='form-control'][@name='postcode']");
    private static By cityInput = By.xpath(".//*[@class='form-control'][@name='city']");

    private static By paymentByCheckRadioButton = By.cssSelector("#payment-option-1");
    private static By paymentByBankTransferRadioButton = By.cssSelector("#payment-option-2");
    private static By termsAndConditionsCheckbox = By.id("conditions_to_approve[terms-and-conditions]");
    private static By orderAndPaymentButton = By.cssSelector(".btn.btn-primary.center-block");
    private static By orderConfirmationBlock = By.id("content-hook_order_confirmation");
    private static By orderConfirmationMessageBlock = By.xpath(".//*[@class='h1 card-title']");

    private static By confirmedOrderProductName = By.xpath(".//*[@class='col-sm-4 col-xs-9 details']");
    private static By confirmedOrderProductPrice = By.xpath(".//*[@class='col-xs-5 text-sm-right text-xs-left']");
    private static By confirmedOrderProductCount = By.xpath(".//*[@class='col-xs-2']");

    static String[] firstNamesArray = {"Zhenya", "Oleg", "Vasya", "Yarik", "Vova"};
    static String firstName = (firstNamesArray[new Random().nextInt(firstNamesArray.length)]);
    static String[] lastNamesArray = {"Smith", "Stone", "Vaise", "Lens", "Little"};
    static String lastName = (lastNamesArray[new Random().nextInt(lastNamesArray.length)]);
    public static String email = "customer" + myprojects.automation.assignment4.model.Random.genInt(1980, 2017) + "@gmail.com";

    public static String adress = "бул. Шевченко, 17";
    public static int postcode = 18000;
    public static String city = "Черкассы";
    public static String orderConfirmationMessage = "\uE876ВАШ ЗАКАЗ ПОДТВЕРЖДЁН";

    public static String getFirstName() {
        return firstName;
    }
    public static String getLastName() {
        return lastName;
    }
    public static By getPersonalInfoBlock() {
        return personalInfoBlock;
    }
    public static By getCustomerFirstNameInput() {
        return customerFirstNameInput;
    }
    public static By getCustomerLastNameInput() {
        return customerLastNameInput;
    }
    public static By getCustomerEmailInput() {
        return customerEmailInput;
    }
    public static By getInfoContinueButton() {
        return infoContinueButton;
    }
    public static String getEmail() {
        return email;
    }
    public static By getPaymentsBlock() {
        return paymentsBlock;
    }
    public static By getAdressInput() {
        return adressInput;
    }
    public static By getPostcodeInput() {
        return postcodeInput;
    }
    public static By getCityInput() {
        return cityInput;
    }
    public static String getAdress() {
        return adress;
    }
    public static int getPostcode() {
        return postcode;
    }
    public static String getCity() {
        return city;
    }
    public static By getDeliveryBlock() {
        return deliveryBlock;
    }
    public static By getAdressContinueButton() {
        return adressContinueButton;
    }
    public static By getPaymentBlock() {
        return paymentBlock;
    }
    public static By getDeliveryContinueButton() {
        return deliveryContinueButton;
    }
    public static By getPaymentByCheckRadioButton() {
        return paymentByCheckRadioButton;
    }
    public static By getPaymentByBankTransferRadioButton() {
        return paymentByBankTransferRadioButton;
    }
    public static By getTermsAndConditionsCheckbox() {
        return termsAndConditionsCheckbox;
    }
    public static By getOrderAndPaymentButton() {
        return orderAndPaymentButton;
    }
    public static By getOrderConfirmationBlock() {
        return orderConfirmationBlock;
    }
    public static By getOrderConfirmationMessageBlock() {
        return orderConfirmationMessageBlock;
    }
    public static String getOrderConfirmationMessage() {
        return orderConfirmationMessage;
    }
    public static By getConfirmedOrderProductName() {
        return confirmedOrderProductName;
    }
    public static By getConfirmedOrderProductPrice() {
        return confirmedOrderProductPrice;
    }
    public static By getConfirmedOrderProductCount() {
        return confirmedOrderProductCount;
    }
}
