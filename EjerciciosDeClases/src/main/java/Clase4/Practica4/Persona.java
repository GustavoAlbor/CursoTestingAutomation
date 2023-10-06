package Clase4.Practica4;

public class Persona {

    protected String nombre;
    protected String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void saludar() { //Se realiza un metodo en la clase padre para luego sobreescribir en las demas

        System.out.println("Hola, como estan?");
    }
}
