package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import opencart.Pages.LoginPage;


public class LoginDefinitions {

    LoginPage loginPage;


    public LoginDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
    }

    @Cuando("el usuario ingresa credenciales validas")
    public void elUsuarioIngresaCredencialesValidas(){
        loginPage.login("tavo@tavo.com.ar", "12345678");
    }

}
