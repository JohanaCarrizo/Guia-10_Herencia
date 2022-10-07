public class Main {

    public static void main(String[] args) {

        //Declaración de otro objeto Perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();


        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();

        //Declaración del objeto Gato

        Animal gato1= new Gato("Pelusa", "Galletas", 15, "Sianés");
        gato1.Alimentarse();

        //Declaración del objeto Caballo

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }


}