import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //mostrarPrecioAlquiler(crearRepo());
        iniciar();

    }
    public static void menu(){

        System.out.println("============ SISTEMA DE ALQUILER ============");
        System.out.println("Selecciones el barco: ");
        System.out.println("1) Velero \n2) Barco a motor \n3) Yate \n4) Salir");

    }
    public static void iniciar(){

        Scanner leer = new Scanner(System.in);
        boolean enCurso = true;
        do{
        menu();
        int op = leer.nextInt();

            switch (op){

                case 1:
                    llenarDatosPersonales(new Velero(456, 100, "1994", 2));
                    break;
                case 2:
                    llenarDatosPersonales(new BarcoAMotor(456, 100, "1980", 2000));
                    break;
                case 3:
                    llenarDatosPersonales( new Yate(456, 100, "1986", 2000, 5));
                    break;
                case 4:
                    enCurso = false;
                    break;
            }

        }while(enCurso);
    }

    public static void llenarDatosPersonales(Barco barco){

        Scanner leer = new Scanner(System.in);
        Alquiler alquiler1 = new Alquiler();
        System.out.println("Nombre del cliente: ");
        alquiler1.setNombre(leer.next());
        System.out.println("Numero de documento: ");
        alquiler1.setDNI(leer.nextLong());
        alquiler1.setFechaAlquiler(new Date(122, 10, 14));
        alquiler1.setFechaDevolucion(new Date(122,10,20));
        alquiler1.setPosicionAmarre(1);
        alquiler1.setBarco(barco);

        mostrarAlquiler(alquiler1);

    }

    public static void mostrarAlquiler(Alquiler alquiler){

        System.out.println("///////// ALQUILER REALIZADO CON EXITO /////////\n");
        System.out.println("El precio del alquiler es: "+alquiler.calcularAlquiler()+"\n");
    }


    public static ArrayList<Alquiler> crearRepo(){

        ArrayList<Alquiler> alquileres = new ArrayList<>();

        Alquiler alquiler = new Alquiler("Rodriguez", 159753, new Date(122, 10, 14), new Date(122,10,20), 1,
                new Velero(456, 100, "1994", 2));

        Alquiler alquiler1 = new Alquiler("Correa", 159753, new Date(122, 10, 14), new Date(122,10,20), 1,
                new BarcoAMotor(456, 100, "1980", 2000));

        Alquiler alquiler2 = new Alquiler("Messi", 159753, new Date(122, 10, 14), new Date(122,10,20), 1,
                new Yate(456, 100, "1986", 2000, 5));

        alquileres.add(alquiler);
        alquileres.add(alquiler1);
        alquileres.add(alquiler2);

        return alquileres;

    }

    public static void mostrarPrecioAlquiler(ArrayList<Alquiler> alquileres){

        alquileres.stream().forEach(a -> System.out.println("El precio es de: "+ a.calcularAlquiler()));

    }
}