public class Main {
    public static void main(String[] args) {

        Electrodomestico lavadora = Lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println(lavadora.getPrecio());

        //--------------------------------------------

        Electrodomestico tv = Televisor.crearTelevisor();
        tv.precioFinal();
        System.out.println(tv.getPrecio());
    }
}