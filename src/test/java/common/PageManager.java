package common;

import driver.DriverFactory;
import pages.LoginPage;

public class PageManager {
    public LoginPage loginPage;



    public PageManager() {

        DriverFactory.initDriver();

        loginPage = PageFactory.buildLoginPage();

    }
}