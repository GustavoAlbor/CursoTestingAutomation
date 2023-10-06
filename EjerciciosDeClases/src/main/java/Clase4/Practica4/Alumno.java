package Clase4.Practica4;

public class Alumno extends Persona {    //Con "extends" se realiza la Herencia de clases

    private String matricula;
    private Integer nota;

    public Alumno(String matricula, Integer nota, String nombre, String apellido){
        super(nombre, apellido); //
        this.matricula = matricula;
        this.nota = nota;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override //Sobreescritura de un metudo en la clase hija
    public void saludar(){
        System.out.println("Que ondaa?");
    }
}
