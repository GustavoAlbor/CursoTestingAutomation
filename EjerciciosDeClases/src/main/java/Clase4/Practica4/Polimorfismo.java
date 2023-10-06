package Clase4.Practica4;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("123", 8, "Pepe", "Pepito");

        Profesor profesor = new Profesor("Juan", "Lopez");

        NoDocente noDocente = new NoDocente("Marta", "Ramirez");

        List<Persona> ListaDePersonas = new ArrayList<>();

        ListaDePersonas.add(alumno);
        ListaDePersonas.add(profesor);
        ListaDePersonas.add(noDocente);

        for (Persona persona: ListaDePersonas){
            persona.saludar();
        }

    }
}
