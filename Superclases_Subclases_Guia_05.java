// Definición de la superclase Vehiculo
class Vehiculo {
    protected String marca; // Marca del vehículo

    // Constructor de la superclase Vehiculo
    public Vehiculo(String marca) {
        this.marca = marca; // Inicialización de la marca
    }

    // Método para conducir un vehículo
    public void conducir() {
        System.out.println("Conduciendo un vehículo de marca " + marca);
    }
}

// Definición de la subclase Coche que extiende de Vehiculo
class Coche extends Vehiculo {
    private String modelo; // Modelo específico del coche

    // Constructor de la subclase Coche
    public Coche(String marca, String modelo) {
        super(marca); // Llamada al constructor de la superclase
        this.modelo = modelo; // Inicialización del modelo
    }

    // Método para conducir un coche, sobrescrito de la superclase
    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche de marca " + marca + " y modelo " + modelo);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la superclase Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota");
        vehiculo.conducir(); // Llamada al método conducir de la superclase

        // Creación de un objeto de la subclase Coche
        Coche coche = new Coche("Ford", "Fiesta");
        coche.conducir(); // Llamada al método conducir de la subclase
    }
}
