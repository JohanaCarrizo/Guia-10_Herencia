import java.util.Scanner;

public class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora() {
    }

    public Lavadora(String color, char consumoEnergetico, double peso, double carga) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public static Lavadora crearLavadora(){

        Scanner leer = new Scanner(System.in);
        System.out.println("******CREAR NUEVA LAVADORA******\n");
        Electrodomestico electro = crearElectrodomestico();
        System.out.println("Ingrese la carga de la Lavadora: ");
        double cargaIngresada = leer.nextDouble();

        return new Lavadora(electro.getColor(), electro.getConsumoEnergetico(), electro.getPeso(), cargaIngresada);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga > 30){

            setPrecio(getPrecio()+500);
        }
    }
}
