import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Lavadora lav = new Lavadora();
        lav.crearLavadora();

        Lavadora lav2 = new Lavadora();
        lav2.crearLavadora();

        //******************************/

        Televisor tv = new Televisor();
        tv.crearTelevisor();

        Televisor tv2 = new Televisor();
        tv2.crearTelevisor();
        
        //*******************************/
        ArrayList<Electrodomestico> electro = new ArrayList<>();

        electro.add(lav);
        electro.add(lav2);
        electro.add(tv);
        electro.add(tv2);

        for (Electrodomestico electrodomestico : electro) {
            
            electrodomestico.precioFinal();
            electrodomestico.mostrarElectrodomestico();
        }
    }
}
