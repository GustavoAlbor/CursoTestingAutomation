package com.ejercicio1;

public class Calculadora {

    public double num1;
    public double num2;
    public String resultado;


    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    //Se realiza un metodo Resultado que me compara el resultado obtenido de las operaciones
    // Y, segun en que rango de numeros se encuentre, devuelve los mensajes mostrados alli.
    public String resultado(double resultado) {
        if (resultado < 0) {
            return "Tene cuidado, el resultado es negativo!";
        } else if (resultado>= 0 && resultado < 10000){
            return "Resultado dentro de los limites";
        } else return "Error, resultado muy grande";
    }
}