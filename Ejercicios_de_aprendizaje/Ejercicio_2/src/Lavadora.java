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

    public void crearLavadora(){

        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la carga: ");
        carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga > 30){

            setPrecio(getPrecio()+500);
        }
    }

    @Override
    public void mostrarElectrodomestico() {
        super.mostrarElectrodomestico();
        System.out.println("Carga --> "+carga+"\n");
    }
}
