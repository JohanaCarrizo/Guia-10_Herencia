import java.util.Scanner;

public class Televisor extends Electrodomestico{

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public static Televisor crearTelevisor(){

        Scanner leer = new Scanner(System.in);
        System.out.println("******CREAR NUEVO TELEVISOR******\n");
        Electrodomestico electro = crearElectrodomestico();
        System.out.println("Ingrese la resolución del TV: ");
        double pulgada = leer.nextDouble();
        System.out.println("Ingrese (Y) si cuenta con sintonizador, caso contrario (N) ");
        boolean siTiene = leer.next().equalsIgnoreCase("Y") ? true : false;

        return new Televisor(electro.getColor(), electro.getConsumoEnergetico(), electro.getPeso(), pulgada, siTiene);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        double precioConIncremento = 0;
        if(getResolucion() > 40){

            precioConIncremento = getPrecio() + getPrecio() * 0.3;
            setPrecio(precioConIncremento);
        }
        if(isSintonizadorTDT()){

            precioConIncremento = getPrecio() + 500;
            setPrecio(precioConIncremento);
        }
    }
}
