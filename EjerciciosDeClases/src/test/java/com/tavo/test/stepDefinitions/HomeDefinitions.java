package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import opencart.Pages.HomePage;
import org.testng.Assert;

public class HomeDefinitions {

    HomePage homePage;

    public HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Given("que el usuario ingresa a la pagina de opencart")
    public void queElUsuarioIngresaALaPaginaDeOpencart() {
        Hooks.getDriver().get("https://opencart.abstracta.us/");
    }

    @Then("se valida que el usuario se encuentra en la home")
    public void seValidaQueElUsuarioSeEncuentraEnLaHome() {
        Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carrouselEsVisible());
    }

    @Cuando("el usuario ingresa al login")
    public void elUsuarioIngresaAlLogin() {
        homePage.ingresarAlLogin();
    }

    @Cuando("el usuario ingresa al boton de register")
    public void elUsuarioIngresaAlBotonDeRegister() {
        homePage.ingresarAlRegister();
    }

    @Y("el usuario ingresa a la Wish List")
    public void elUsuarioIngresaALaWishList() {
        homePage.ingresarALaWishList();
    }
}
