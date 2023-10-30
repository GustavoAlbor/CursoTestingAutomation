package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import opencart.Pages.AccountPage;
import org.testng.Assert;

public class AccountDefinitions {

    AccountPage accountPage;

    public AccountDefinitions() {
        this.accountPage = new AccountPage(Hooks.getDriver());
    }

    @Entonces("se valida el registro exitoso del usuario")
    public void seValidaElRegistroExitosoDelUsuario(){
        Assert.assertEquals(accountPage.getTitulo(),"Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }
}
