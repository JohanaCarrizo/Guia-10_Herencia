public class Main {
    public static void main(String[] args) {

        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        lavadora.precioFinal();
        lavadora.mostrarElectrodomestico();

        //--------------------------------------------

        Televisor tv = new Televisor();
        tv.crearTelevisor();
        tv.precioFinal();
        tv.mostrarElectrodomestico();
    }
}