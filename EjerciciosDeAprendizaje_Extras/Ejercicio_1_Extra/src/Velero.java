public class Velero extends Barco{

    private int numeroMastil;

    public Velero() {
    }

    public Velero(int matricula, double eslora, String anioFabricacion, int numeroMastil) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastil = numeroMastil;
    }

    public int getNumeroMastil() {
        return numeroMastil;
    }

    public void setNumeroMastil(int numeroMastil) {
        this.numeroMastil = numeroMastil;
    }

    /**
     * calcular sacando el módulo normal y sumandole número de mástiles
     * @return
     */
    @Override
    public double calcularAlquiler() {
        return ((10*getEslora()) + numeroMastil);
    }
}
