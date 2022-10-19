/**
 * • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
 * por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
 * los atributos del padre.
 */
public class EdificioDeOficina extends Edificio{

    private int cantOficina;
    private int cantPersona;
    private int cantPiso;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(double alto, double ancho, double largo, int cantOficina, int cantPersona, int cantPiso) {
        super(alto, ancho, largo);
        this.cantOficina = cantOficina;
        this.cantPersona = cantPersona;
        this.cantPiso = cantPiso;
    }

    public int getCantOficina() {
        return cantOficina;
    }

    public void setCantOficina(int cantOficina) {
        this.cantOficina = cantOficina;
    }

    public int getCantPersona() {
        return cantPersona;
    }

    public void setCantPersona(int cantPersona) {
        this.cantPersona = cantPersona;
    }

    public int getCantPiso() {
        return cantPiso;
    }

    public void setCantPiso(int cantPiso) {
        this.cantPiso = cantPiso;
    }

    /**
     * Crear el método cantPersonas(), que muestre
     * cuantas personas entrarían en un piso y cuantas en todo el edificio.
     * @return
     */
    public int cantidadPersona(){

        return cantPersona*cantOficina;
    }


    @Override
    public double calcularSuperficie() {
        return getAlto()*getAncho();
    }

    @Override
    public double calcularVolumen() {
        return getAlto()*getAncho()*getLargo();
    }
}
