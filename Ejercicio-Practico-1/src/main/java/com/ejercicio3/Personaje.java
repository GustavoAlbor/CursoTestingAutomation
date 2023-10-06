package com.ejercicio3;

abstract public class Personaje {

    public Integer Salud;
    abstract public void entrenar();

    public Personaje(Integer salud) {
        Salud = salud;
    }

    public Integer getSalud() {
        return Salud;
    }

    public void setSalud(Integer salud) {
        Salud = salud;
    }
}
