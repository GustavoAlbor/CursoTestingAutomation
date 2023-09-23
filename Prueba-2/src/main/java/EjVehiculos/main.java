package EjVehiculos;

public class main {

    public static void main(String[] args) {

        Vehiculos Toyota = new Vehiculos("Toyota","Corolla",2020);
        Coche Ford = new Coche("Ford","Mustang",2021,5000);
        Vehiculos Fiat = new Coche("Fiat", "Cronos", 2023,2000);

        System.out.println("Marca: " + Toyota.getMarca());
        System.out.println("Modelo: " + Toyota.getModelo());
        System.out.println("Año: " + Toyota.getAño());
        Toyota.acelerar();

        System.out.println();

        System.out.println("Marca: " + Ford.getMarca());
        System.out.println("Modelo: " + Ford.getModelo());
        System.out.println("Año: " + Ford.getAño());
        System.out.println("Cilindrada: " + Ford.getCilindrada());
        Ford.acelerar();

        System.out.println();

        System.out.println("Marca: " + Fiat.getMarca());
        System.out.println("Modelo: " + Fiat.getModelo());
        System.out.println("Año: " + Fiat.getAño());
        //System.out.println("Cilindrada: " + Fiat.getCilindrada());
        Fiat.acelerar();

    }
}
