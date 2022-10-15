import static java.lang.Math.PI;

public class Circulo implements IcalculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.round(PI * Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return Math.round(PI * (radio + radio));
    }

    public String getNombre(){return "Circulo";}
}
