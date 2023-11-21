package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import opencart.Pages.CamerasPage;
import opencart.Pages.CanonPage;
import opencart.Pages.MyAccountPage;
import org.testng.Assert;

public class MyAccountDefinitions {

    MyAccountPage myAccountPage;
    CamerasPage camerasPage;
    CanonPage canonPage;

    public MyAccountDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.camerasPage = new CamerasPage(Hooks.getDriver());
        this.canonPage = new CanonPage(Hooks.getDriver());
    }

    @Entonces("se valida que el usuario se encuentra en su cuenta")
    public void seValidaQueElUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }

    @Cuando("el usuario selecciona la pestaña Camera")
    public void elUsuarioSeleccionaLaPestañaCamera() {
        myAccountPage.ingresarACamaras();
    }

    @Cuando("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {
        myAccountPage.ingresarACamaras();
        camerasPage.ingresarACanonEOS();
        canonPage.SeleccionarColor(Hooks.getConfigValue("Opcion"));
        canonPage.AgregarACarrito();
    }
}
