package com.ejercicio3;

public class Mago extends Personaje{

    public String magia;

    public Mago(Integer salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public void entrenar() {
    }
}
