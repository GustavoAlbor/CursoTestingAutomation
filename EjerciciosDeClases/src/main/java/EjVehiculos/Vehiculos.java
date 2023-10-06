package EjVehiculos;

public class Vehiculos {

    private String marca;
    private String modelo;
    private Integer año;

    public Vehiculos(String marca, String modelo, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void acelerar(){
    System.out.println("Acelerar");
    }

    public void frenar(){
        System.out.println("Frenar");
    }
}
