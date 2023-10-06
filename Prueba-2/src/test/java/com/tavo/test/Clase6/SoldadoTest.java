package com.tavo.test.Clase6;

import Clase6.Soldado;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoldadoTest {

    @Test
    public void pelearTest(){
        Soldado soldado = new Soldado(60);
        soldado.pelear(30);

        Assert.assertEquals(soldado.getSalud(), 45,"Error en el valor de la Salud");
    }

    @Test
    public void muerteTest(){
        Soldado soldado = new Soldado(50);
        soldado.pelear(500);

        Assert.assertTrue(soldado.estaMuerto());
    }

    @Test
    public void NomuerteTest(){
        Soldado soldado = new Soldado(50);
        soldado.pelear(10);

        Assert.assertFalse(soldado.estaMuerto());
    }

    @Test
    public void DescansarTest(){
        Soldado soldado = new Soldado(80);
        soldado.descansar();

        Assert.assertEquals(soldado.getSalud(),90);
    }

}
