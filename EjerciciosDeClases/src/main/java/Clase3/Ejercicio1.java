package Clase3;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Ejemplo con WHILE
        int contador = 0;

        while (contador < 5) {
            System.out.println( contador + " Hola Mundo");
            contador = contador + 1; //se pueden usar tambien "contador =+ 1" o "contador++"
        }


        System.out.println();

        // Ejemplo con DO-WHILE
        int contadorDoWhile = 0;

        do {
            System.out.println( contadorDoWhile + ") Hola Mundo");
            contadorDoWhile = contadorDoWhile + 1 ;
        } while (contadorDoWhile< 5);

        System.out.println();

        for(int i = 0; i<5; i++){
            System.out.println( i + ") Hola Mundo");
        }
    }

}
