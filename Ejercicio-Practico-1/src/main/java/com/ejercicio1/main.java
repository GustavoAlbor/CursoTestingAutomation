package com.ejercicio1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Inicializo un objeto scanner para realizar los ingresos de los datos por teclado
        // Inicializo un objeto perteneciente a la clase calculadora para utilizar sus atributos.
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        for (int i=0; i<5; i++){ //Metodo for para contabilizar 5 iteraciones de calculadora y que finalice el programa

            //Se ingresan los numeros y la operacion a realizar
            System.out.println("Ingresar el primer valor: ");
            double numero1 = scanner.nextDouble();
            System.out.println("Ingresar el segundo valor: ");
            double numero2 = scanner.nextDouble();
            System.out.println("Ingresar operacion (+,-,*,/): ");
            String Operador = scanner.next();

            // Condicionales que indican cual metodo usar segun el operador ingresado por teclado
            if (Operador.equals("+")) {

                double resultado = calculadora.suma(numero1,numero2); // Se realiza la suma y se guarda en resultado
                System.out.println("Resultado: " + resultado); //Se imprime el resultado
                System.out.println(" - " + calculadora.resultado(resultado)); // Se verifica dentro de que limites esta el resultado

            } else if (Operador.equals("-")) {

                double resultado = calculadora.resta(numero1,numero2);
                System.out.println("Resultado: " + resultado);
                System.out.println(" - " + calculadora.resultado(resultado));

            } else if (Operador.equals("*")) {

                double resultado = calculadora.multiplicacion(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                System.out.println(" - " + calculadora.resultado(resultado));

            } else if (Operador.equals("/")) {
                //En la division, al dividir por Cero nos devuelve el valor "Infinity"
                // En matematicas es un error dividir por cero ya que tiende al infinito
                // En este caso, se pregunta si el numero 2 (Denominador) ingresado es 0, en caso de que si,
                // Se devuelve el mesaje de error, en caso contrario se realiza la division normal
                if (numero2 == 0){
                    System.out.println("ERROR - No se puede dividir por cero.");
                } else {
                    double resultado = calculadora.division(numero1, numero2);
                    System.out.println("Resultado: " + resultado);
                    System.out.println(" - " + calculadora.resultado(resultado));
                }

            } else System.out.println("Operacion no valida");


        }
        scanner.close();

    }

}
