/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
 * edificio tendrá como métodos:
 *
 * • Método calcularSuperficie(): calcula la superficie del edificio.
 * • Método calcularVolumen(): calcula el volumen del edificio.
 */
public abstract class Edificio{

    private double alto;
    private double ancho;
    private double largo;

    public Edificio() {
    }

    public Edificio(double alto, double ancho, double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }


    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();
}
