package Clase3;

import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Ej3Integrador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer numero;
        List<Integer> miLista = new ArrayList<>();

        System.out.println("El ingreso finaliza con un numero mayor a 500");
        do {
            System.out.println("Ingresar numero: ");
            numero = scanner.nextInt();

            miLista.add(numero);
        } while (numero <= 500);

        System.out.println("Cantidad ingresada: " + miLista.size());

        if (miLista.size()<10){
            System.out.println("Se ingresaron pocos numeros");
        } else {
            System.out.println("Se excedio la candidad de ingresos");
        }
    }
}
