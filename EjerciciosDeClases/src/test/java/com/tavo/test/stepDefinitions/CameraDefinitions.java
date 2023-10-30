package com.tavo.test.stepDefinitions;

import com.tavo.test.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import opencart.Pages.CamerasPage;

public class CameraDefinitions {

    CamerasPage camerasPage;

    public CameraDefinitions(){
        this.camerasPage = new CamerasPage(Hooks.getDriver());
    }

    @Cuando("agrega un producto a favoritos")
    public void agregaUnProductoAFavoritos(){
        camerasPage.AgregarAFavoritos();
    }

}
