public class Animal {

    private String nombre;
    private String alimento;
    private String raza;
    private int edad;

    public Animal(String nombre, String alimento, int edad, String raza){

        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void Alimentarse(){

        System.out.println("Me alimento de comida");
    }
}
