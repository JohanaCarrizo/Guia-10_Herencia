/**
 * • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
 * Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
public class Polideportivo extends Edificio{

    private String nombre;
    private TipoInstalacion tipo;

    public Polideportivo() {
    }


    public Polideportivo(double alto, double ancho, double largo, String nombre, TipoInstalacion tipo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstalacion tipo) {
        this.tipo = tipo;
    }

    /**
     * cuántos polideportivos son
     * techados y cuantos abiertos.
     * @return
     */
    public boolean verificarTipoInstalacion(){

        return tipo == TipoInstalacion.ABIERTO ? true : false;
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
