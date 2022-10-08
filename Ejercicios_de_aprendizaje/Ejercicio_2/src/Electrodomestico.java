import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Electrodomestico {

    private double precio;
    private String color;
    private List<String> tipoConsumos = Arrays.asList("A", "B", "C", "D", "E", "F");
    private List<String> colores = Arrays.asList("BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS");
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, double peso) {
        this.precio = 1000;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra){

        String nuevaLetra = String.valueOf(letra);
        for (String aux: tipoConsumos) {

            if(aux.equalsIgnoreCase(nuevaLetra)){

                return letra;
            }
        }
        return 'F';
    }

    public String comprobarColor(String color){

        for (String aux: colores) {

            if(aux.equalsIgnoreCase(color)){

                return color;
            }
        }
        return "BLANCO";
    }

    public static Electrodomestico crearElectrodomestico(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el consumo energetico A ~ F ");
        char consEnergetico = leer.next().charAt(0);

        System.out.println("Ingrese el color: ");
        String colorIngresado = leer.next();

        System.out.println("Ingrese el peso: ");
        double pe = leer.nextDouble();

        return new Electrodomestico(colorIngresado, consEnergetico, pe);
    }

    public void precioFinal(){

        String letra = String.valueOf(consumoEnergetico);
        switch (letra.toUpperCase()){

            case "A":
                precio = retornarPrecio(peso) + 1000;
                break;
            case "B":
                precio = retornarPrecio(peso) + 800;
                break;
            case "C":
                precio = retornarPrecio(peso) + 600;
                break;
            case "D":
                precio = retornarPrecio(peso) + 500;
                break;
            case "E":
                precio = retornarPrecio(peso) + 300;
                break;
            case "F":
                precio = retornarPrecio(peso) + 100;
                break;
        }

    }
    public double retornarPrecio(double peso){

        if(peso > 1 && peso < 19){
            precio += 100;
        }else if(peso > 20 && peso < 49){

            precio += 500;
        }else if(peso > 50 && peso < 70){

            precio += 800;
        }else if(peso > 80){

            precio += 1000;
        }

        return precio;
    }
}
