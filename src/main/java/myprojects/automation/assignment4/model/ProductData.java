package myprojects.automation.assignment4.model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;

/**
 * Hold Product information that is used among tests.
 */
public class ProductData {
    public static String name;
    public static int qty;
    public static float price;

    public ProductData(String name, int qty, float price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public static String getName() {
        return name;
    }

    public static Integer getQty() {
        return qty;
    }

    public static String getPrice() {
        DecimalFormatSymbols separators = new DecimalFormatSymbols();
        separators.setDecimalSeparator(',');
        return new DecimalFormat("#0.00", separators).format(price);
    }

    /**
     * @return New Product object with random name, quantity and price values.
     */
    public static ProductData generate() {
        Random random = new Random();
        return new ProductData(
//                "New Product " + System.currentTimeMillis(),
                "New Product " + myprojects.automation.assignment4.model.Random.genInt(1,999),
                random.nextInt(100) + 1,
                (float) Math.round(random.nextInt(100_00) + 1) / 100);
    }


    public static String name2 = "Product " + myprojects.automation.assignment4.model.Random.genInt(1, 1000);
    public static String getName2() {
        return name2;
    }

    public static int count2 = myprojects.automation.assignment4.model.Random.genInt(1, 100);
    public static int getCount2() {
        return count2;
    }

    public static float price2 = myprojects.automation.assignment4.model.Random.genFloat(1.00, 100.00);
    public static float getPrice2() {
        return price2;
    }
}
