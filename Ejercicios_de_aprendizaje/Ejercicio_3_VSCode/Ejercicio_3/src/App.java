import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
                
        ArrayList<Electrodomestico> listaElectro = iniciarRepo();

        System.out.println("La suma de todos los electrodomesticos es de: "+sumaPrecio(listaElectro)+"$");

    }

    public static ArrayList<Electrodomestico> iniciarRepo(){

        ArrayList<Electrodomestico> electro = new ArrayList<>();
        Lavadora lavadora1 = new Lavadora("GRIS", 'B', 15, 35);
        Lavadora lavadora2 = new Lavadora("Rojo", 'D', 45, 20);
        Televisor tv1 = new Televisor("BLANCO", 'A', 30, 60, true);
        Televisor tv2 = new Televisor("AZUL", 'F', 35, 65, true);

        electro.add(lavadora1);
        electro.add(lavadora2);
        electro.add(tv1);
        electro.add(tv2);

        return electro;

    }

    public static double sumaPrecio(ArrayList<Electrodomestico> e){

        double suma = 0;
        for (Electrodomestico electrodomestico : e) {
            
            electrodomestico.precioFinal();
            System.out.println(electrodomestico.getNombre()+", precio = "+electrodomestico.getPrecio()+"$");
            suma += electrodomestico.getPrecio();
        }

        return suma;
    }

}
