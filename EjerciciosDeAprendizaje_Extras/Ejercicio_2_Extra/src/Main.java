import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        EdificioDeOficina oficina1 = crearOficina();
        EdificioDeOficina oficina2 = crearOficina();

        /***************************************************/

        Polideportivo poli1 = new Polideportivo(2000, 2500, 2000, "PolinoDeortivo", TipoInstalacion.ABIERTO);
        Polideportivo poli2 = new Polideportivo(2500, 2500, 2000, "San Francisco", TipoInstalacion.TECHADO);

        /***************************************************/

        ArrayList<Edificio> listaEdificios = new ArrayList<>();
        listaEdificios.add(oficina1);
        listaEdificios.add(oficina2);
        listaEdificios.add(poli1);
        listaEdificios.add(poli2);

        visualizarTodoLosEdificios(listaEdificios);
    }

    public static EdificioDeOficina crearOficina(){

        System.out.println("EDIFICIO DE OFICINA");
        System.out.println("Ingrese la cantidad de persona que entran en una oficina: ");
        int numPersona = leer.nextInt();
        System.out.println("Ingrese la cantidad de piso que tiene el edificio: ");
        int numPiso = leer.nextInt();
        System.out.println("****************************************************");
        return new EdificioDeOficina(1500, 2000, 1500, numPiso, numPersona, numPiso);
    }

    /**
     * recorrer este array y ejecutar los
     * métodos calcularSuperficie y calcularVolumen en cada Edificio.
     * @param e
     */
    public static void visualizarTodoLosEdificios(ArrayList<Edificio> e){

        for (int i = 0; i < e.size(); i++) {

            if(e.get(i) instanceof EdificioDeOficina){

                EdificioDeOficina oficina = (EdificioDeOficina) e.get(i);
                System.out.println("Oficina "+(i+1)+"\nCantidad de personas que entran en todo el edificio --> "+oficina.cantidadPersona()
                                  +"\nCantidad de persona por oficina --> "+oficina.getCantPersona());
                System.out.println("Superficie --> "+oficina.calcularSuperficie()+"\nVolumen --> "+oficina.calcularVolumen()+"\n");

            }else{

                Polideportivo poli = (Polideportivo) e.get(i);
                System.out.println("\nPolideportivo "+(i+1));
                cantidadTipoInstalacion(poli);
                System.out.println("Superficie --> "+poli.calcularSuperficie()+"\nVolumen --> "+poli.calcularVolumen()+"\n");
            }
        }

    }
    public static void cantidadTipoInstalacion(Polideportivo p){

        int contTechado = 0;
        int contAbierto = 0;

        if(p.verificarTipoInstalacion()){

            contAbierto++;
            System.out.println("Polideportivos de instalación ABIERTO--> "+ contAbierto);
        }else{

            contTechado++;
            System.out.println("Polideportivos de instalación TECHADO --> " +contTechado);
        }
    }

}