package com.tavo.test.Clase6;

import com.tavo.test.opencart.BaseTest;
import org.testng.annotations.Test;


public class PrimerPruebaAutomationTest extends BaseTest {

    @Test
    public void abrirPagina(){
        getDriver().get("https://opencart.abstracta.us/");
    }

}
