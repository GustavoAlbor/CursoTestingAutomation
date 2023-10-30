package com.tavo.test.opencart;

import opencart.Pages.HomePage;
import opencart.Pages.LoginPage;
import opencart.Pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //1)
        getDriver().get("https://opencart.abstracta.us/");

        // 2) y 3)
        homePage.ingresarAlLogin();

        // 4)
        loginPage.login("pepe@pepe.com.ar", "12345678");

        // 5)
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }

}
