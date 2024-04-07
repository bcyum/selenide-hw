package common;


import pages.LoginPage;

public class PageFactory {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/");
    }

}