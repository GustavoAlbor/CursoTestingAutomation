package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import opencart.Pages.MyAccountPage;
import org.testng.Assert;

public class MyAccountDefinitions {

    MyAccountPage myAccountPage;

    public MyAccountDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Entonces("se valida que el usuario se encuentra en su cuenta")
    public void seValidaQueElUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }

    @Cuando("el usuario selecciona la pestaña Camera")
    public void elUsuarioSeleccionaLaPestañaCamera() {
        myAccountPage.ingresarACamaras();
    }
}
