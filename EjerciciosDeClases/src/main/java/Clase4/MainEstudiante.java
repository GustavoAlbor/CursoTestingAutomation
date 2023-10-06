package Clase4;

public class MainEstudiante {

    public static void main(String[] args) {

        Ej1Estudiante jose = new Ej1Estudiante(100,"Jose", "Lopez", 5.4f); //Instancia de un objeto, se le cargan los parametros
        // Se inicializan los atributos a un objeto

        Ej1Estudiante pepe = new Ej1Estudiante();

        // Los getter nos devuelven una salida si se los llama
        System.out.println("Nombre: " + jose.getNombre());
        System.out.println("Apellido: " + jose.getApellido());
        System.out.println("Promedio: " + jose.getPromedio());

        // Los setter sirven para modificar las variables durante el programa
        jose.setPromedio(7.0f);

        System.out.println("Promedio: " + jose.getPromedio());
    }
}
