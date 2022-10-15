public class BarcoAMotor extends Barco{

    private double potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int matricula, double eslora, String anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    /**
     * calcular sacando el módulo normal y la potencia en CV
     * @return
     */
    @Override
    public double calcularAlquiler() {
        return ((10*getEslora()) + potenciaCV);
    }

}
