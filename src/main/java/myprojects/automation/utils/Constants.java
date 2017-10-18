package myprojects.automation.utils;


public class Constants {

    public static String getAdminLogin() {
        return System.getProperty("AdminLogin", "webinar.test@gmail.com");
    }
    public static String getAdminPassword() {
        return System.getProperty("AdminPassword", "Xcg7299bnSmMuRLp9ITw");
    }
    public static String getUserLogin() {
        return System.getProperty("AdminLogin", "zhenyabrik2014@gmail.com");
    }
    public static String getUserPassword() {
        return System.getProperty("AdminPassword", "qwerty123");
    }


}
