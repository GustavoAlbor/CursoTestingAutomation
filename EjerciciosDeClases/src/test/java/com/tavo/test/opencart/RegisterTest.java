package com.tavo.test.opencart;

import com.github.javafaker.Faker;
import opencart.Pages.AccountPage;
import opencart.Pages.HomePage;
import opencart.Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void createAccount(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());

        Faker faker = new Faker();

        getDriver().get("https://opencart.abstracta.us/");

        homePage.ingresarAlRegister();
        registerPage.PersonalDetails("Hernan", "Perez",faker.internet().emailAddress(),"12345678");
        registerPage.CompletePassword("12345","12345");
        registerPage.PrivacyPolicyCheck();
        registerPage.ContinuarRegistro();

        Assert.assertEquals(accountPage.getTitulo(),"Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }

}
