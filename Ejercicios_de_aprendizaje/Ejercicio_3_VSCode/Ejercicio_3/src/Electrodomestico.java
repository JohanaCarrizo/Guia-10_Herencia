import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Electrodomestico {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private int peso;
    
    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoEnergetico, int peso) {
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra){

        if(letra == 'A' || letra == 'B' ||letra == 'C' ||letra == 'D' ||letra == 'E' ||letra == 'F'){

            return letra;
        }else{

            return 'F';
        }
    }

    public String comprobarColor(String color){

        List<String> listaColores = Arrays.asList("BLANCO", "NEGRO", "GRIS", "ROJO", "AZUL");

        for (String colorAux : listaColores) {

            return color.equalsIgnoreCase(colorAux) ? color : "BLANCO";
            
        }

        return null;
    }

    public void crearElectrodomestico(){

        Scanner leer = new Scanner(System.in);
        precio = 1000;
        System.out.println("Ingrese el color: ");
        color = leer.next();
        System.out.println("Ingrese el consumo electrico A ~ F ");
        consumoEnergetico = leer.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        peso = leer.nextInt();

        //new Electrodomestico(color, consumoEnergetico, peso);

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
    
    public void mostrarElectrodomestico(){

        System.out.println("Precio --> "+precio+"\nColor --> "+color+
        "\nConsumoEnergetico --> "+consumoEnergetico+"\nPeso --> "+peso);
    }
}
