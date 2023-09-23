package EjVehiculos;

public class Coche extends Vehiculos {

    private Integer cilindrada;

    public Coche(String marca, String modelo, Integer año, Integer cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar(){
     System.out.println("El coche esta acelerando");
    }

}
