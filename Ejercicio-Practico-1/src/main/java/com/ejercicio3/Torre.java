package com.ejercicio3;

public class Torre extends Personaje{

    public Integer nivel;

    public Torre(Integer salud, Integer nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public void entrenar() {
        setNivel(nivel + 1);
    }
}
