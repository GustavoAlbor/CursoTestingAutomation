package com.tavo.test.opencart;

import opencart.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{

    @Test
    public void agregarProductos(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        CamerasPage camerasPage = new CamerasPage(getDriver());
        WishListPage wishListPage = new WishListPage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");


        homePage.ingresarAlLogin();
        loginPage.login("tavo@tavo.com.ar","12345678");
        myAccountPage.ingresarACamaras();
        camerasPage.AgregarAFavoritos();
        camerasPage.ingresarALaWishList();

        Assert.assertTrue(wishListPage.ProductFavIsDisplayed());
        Assert.assertEquals(wishListPage.ElemFavName(), "Canon EOS 5D");
    }

}
