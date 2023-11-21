package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import opencart.Pages.CanonPage;
import opencart.Pages.CartPage;
import org.testng.Assert;

public class CartDefinitions {

    CartPage cartPage;
    CanonPage canonPage;

    public CartDefinitions(){
        this.cartPage = new CartPage(Hooks.getDriver());
        this.canonPage = new CanonPage(Hooks.getDriver());
    }

    @Entonces("se valida que el producto este agregado al carrito")
    public void seValidaQueElProductoEsteAgregadoAlCarrito(){
        Assert.assertTrue(canonPage.AddCartAlertEsVisible());
        canonPage.IngresarAlCarrito();
        Assert.assertTrue(cartPage.tablaIsDisplayed());
        Assert.assertEquals(cartPage.NombreDelProducto(), "Canon EOS 5D");
//        Assert.assertEquals(cartPage.CartIsEmpty(),"false");
    }

}
