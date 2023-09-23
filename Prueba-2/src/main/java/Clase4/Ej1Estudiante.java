package Clase4;

public class Ej1Estudiante {

    private Integer id;
    private String nombre;
    private String apellido;
    private Float promedio;

    // Creacion del Constructor
    public Ej1Estudiante(Integer id, String nombre, String apellido, Float promedio) {
        this.id = id;                   // El "this" se utiliza para evitar ambiguedades entre la clase y el parametro
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public Ej1Estudiante(){ // Constructor vacio - Se coloca por defauld si no se detalla el constructor
        // Es una mala practica definir un objeto con un constructor vacio ya que no tiene sentido logico
    }

    // Usando el comando "Alt + Insert" se puede autocompletar el Getter, Setter y el Constructor

    // Cracion de Getters y Setters
    public Integer getId(){
        return  id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
}
