package Clase4.Practica4;

public class NoDocente extends Persona {

    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override //Sobreescritura de un metudo en la clase hija
    public void saludar(){
        System.out.println("Buen dia!");

    }
}
