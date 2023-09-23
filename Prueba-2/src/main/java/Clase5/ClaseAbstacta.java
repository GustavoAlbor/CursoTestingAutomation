package Clase5;

import java.util.ArrayList;
import java.util.List;

public class ClaseAbstacta {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(20.5);
        Rectangulo rectangulo = new Rectangulo(10,20);
        Triangulo triangulo = new Triangulo(100,2.5);

        List<Dibujable> ListDibujable = new ArrayList<>();

        ListDibujable.add(cuadrado);
        ListDibujable.add(rectangulo);
        ListDibujable.add(triangulo);
    }
}
