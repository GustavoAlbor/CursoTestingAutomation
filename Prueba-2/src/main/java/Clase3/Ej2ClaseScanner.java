package Clase3;

import java.util.Scanner;

public class Ej2ClaseScanner {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Ingresar un entero");
        int entero = scanner.nextInt();

        System.out.println("Ingresar una cadena");
        String cadena = scanner.next();

        System.out.println("Ingresar un flotante");
        float flotante = scanner.nextFloat();

        System.out.println("Entero ingresado: " + entero);
        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("Flotante ingresado: " + flotante);

        scanner.close();
    }
}
