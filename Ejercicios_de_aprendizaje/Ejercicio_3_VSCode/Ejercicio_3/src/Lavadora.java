import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
        super();       
    }

    public Lavadora(String color, char consumoEnergetico, int peso, int carga) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
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
        // TODO Auto-generated method stub
        super.precioFinal();
        if(carga > 30){

            setPrecio(getPrecio()+500);
        }
    }

    @Override
    public void mostrarElectrodomestico() {
        // TODO Auto-generated method stub
        super.mostrarElectrodomestico();
        System.out.println("Carga --> "+carga+"\n");
    }

    
    
}
