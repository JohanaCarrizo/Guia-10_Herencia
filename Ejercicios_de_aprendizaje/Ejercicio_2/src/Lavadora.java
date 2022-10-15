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

    /**
     *  llama a crearElectrodomestico() de la clase
     * padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
     * el atributo propio de la lavadora.
     */
    public void crearLavadora(){

        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la carga: ");
        carga = leer.nextInt();
    }

    /**
     * carga mayor de 30 kg, aumentará el precio en $500
     */
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
