package Clase4.Practica4;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {

    private List<Alumno> alumnos;

    public Profesor (String nombre, String apellido){
        super (nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    @Override
    public void saludar(){
        System.out.println("Hola a todos!");
    }

    // SE utiliza la sobrecarga de metodos calificar. En el primero se mandan dos atributos
    // en el segundo solo uno "nota" y dependiendo de los parametros que se envien al metodo
    // hace una cosa u otra
    public void calificar(Alumno alumno, Integer nota){
        alumno.setNota(nota);
    }

    public void calificar (Integer nota){
        // alumnos.get(0).setNota(nota); - De esta manera le asignaria la nota a un solo alumno de la lista
        // con el for le agrega la misma nota a todos los alumnos de la lista
        for(int i=0; i< alumnos.size(); i++){
            alumnos.get(i).setNota(nota);
        }
        // Otra manera es utilizando un foreach tambien
//        for (Alumno alumno: alumnos) { //se declara una variable en el momento y el for lo va iterando en la lista
//            alumno.setNota(nota);
//        }
//        //Otra forma mas clara y simplificada es un metodo dentro de la lista.
//        alumnos.forEach(alumno -> alumno.setNota(nota)); //Utiliza una funcion lamda dentro de la variable

    }

}
