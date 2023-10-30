package com.tavo.test.stepDefinitions;

import com.github.javafaker.Faker;
import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import opencart.Pages.RegisterPage;

public class RegisterDefinitions {

    RegisterPage registerPage;
    Faker faker;

    public RegisterDefinitions() {
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.faker = new Faker();
    }

    @Cuando("el usuario completa el form de registro con credenciales validas")
    public void elUsuarioCompletaElFormDeRegistroConCredencialesValidas(){
        registerPage.PersonalDetails("Hernan", "Perez",faker.internet().emailAddress(),"12345678");
        registerPage.CompletePassword("12345","12345");
        registerPage.PrivacyPolicyCheck();
        registerPage.ContinuarRegistro();
    }
}
