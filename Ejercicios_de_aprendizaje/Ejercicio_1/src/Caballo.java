public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        //super.meAlimentoDe();
        System.out.println("Me alimento de alfalfa");
    }
}
