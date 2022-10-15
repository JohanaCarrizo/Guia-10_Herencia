import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(String color, char consumoEnergetico, int peso, double resolucion, boolean sintonizadorTDT) {
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

    public void crearTelevisor(){

        System.out.println("******CREAR NUEVO TELEVISOR******\n");
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in);        
        
        System.out.println("Ingrese la resolución del TV: ");
        resolucion = leer.nextDouble();
        System.out.println("Ingrese (Y) si cuenta con sintonizador, caso contrario (N) ");
        sintonizadorTDT = leer.next().equalsIgnoreCase("Y") ? true : false;
        
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

    @Override
    public void mostrarElectrodomestico() {
        // TODO Auto-generated method stub
        super.mostrarElectrodomestico();
        System.out.println("Resolución --> "+resolucion+"\nSintonizador --> "+sintonizadorTDT+"\n");
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return "Televisor";
    }

    
    
}
