package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import opencart.Pages.WishListPage;
import org.testng.Assert;

public class WishListDefinitions {

    WishListPage wishListPage;

    public WishListDefinitions() {
        this.wishListPage = new WishListPage(Hooks.getDriver());
    }

    @Entonces("se valida que el producto este agregado a la Wish List")
    public void seValidaQueElProductoEsteAgregadoALaWishList(){
        Assert.assertTrue(wishListPage.ProductFavIsDisplayed());
    }

}
