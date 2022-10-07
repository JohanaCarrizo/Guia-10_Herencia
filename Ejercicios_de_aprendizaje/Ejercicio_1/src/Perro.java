public class Perro extends Animal{


    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        //super.meAlimentoDe();
        System.out.println("Me alimento de carne");
    }
}
