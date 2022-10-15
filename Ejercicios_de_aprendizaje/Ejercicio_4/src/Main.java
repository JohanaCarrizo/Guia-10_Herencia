public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(10, 20);
        mostrarResultadoArea(rectangulo);
        mostrarResultadoPerimetro(rectangulo);

        Circulo circulo = new Circulo(9);
        mostrarResultadoArea(circulo);
        mostrarResultadoPerimetro(circulo);
    }

    public static void mostrarResultadoArea(IcalculosFormas formas){

        System.out.println("El area del "+formas.getNombre() +" es: "+formas.calcularArea());
    }

    public static void mostrarResultadoPerimetro(IcalculosFormas formas){

        System.out.println("El perimetro del "+formas.getNombre() +" es: "+formas.calcularPerimetro());
    }
}