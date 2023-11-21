package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import opencart.Pages.CamerasPage;
import opencart.Pages.HomePage;
import opencart.Pages.WishListPage;
import org.testng.Assert;

public class WishListDefinitions {

    WishListPage wishListPage;
    CamerasPage camerasPage;

    public WishListDefinitions() {
        this.wishListPage = new WishListPage(Hooks.getDriver());
        this.camerasPage = new CamerasPage(Hooks.getDriver());
    }

    @Entonces("se valida que el producto este agregado a la Wish List")
    public void seValidaQueElProductoEsteAgregadoALaWishList(){
        camerasPage.ingresarALaWishList();
        Assert.assertTrue(wishListPage.ProductFavIsDisplayed());
        Assert.assertEquals(wishListPage.ElemFavName(), "Canon EOS 5D");
    }

}
