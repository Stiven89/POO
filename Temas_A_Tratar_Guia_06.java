import java.io.FileNotFoundException;

// Definición de la superclase Vehiculo
public class Vehiculo {
    protected String marca; // Accesible en las subclases
    protected String modelo; // Accesible en las subclases

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para obtener la descripción del vehículo
    public String getDescription() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

// Definición de la subclase Coche que extiende de Vehiculo
public class Coche extends Vehiculo {
    private String color; // Accesible solo dentro de la clase Coche

    // Constructor de la clase Coche que llama al constructor de la superclase Vehiculo
    public Coche(String marca, String modelo, String color) {
        super(marca, modelo); // Llama al constructor de la superclase
        this.color = color;
    }

    // Método para obtener la descripción del coche, sobrescribe el método getDescription() de la superclase
    @Override
    public String getDescription() {
        return super.getDescription() + ", Color: " + color;
    }
}

// Definición de la clase Persona
public class Persona {
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrescritura del método equals() para comparar objetos Persona
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona) { // Verifica si el objeto es una instancia de Persona
            Persona otraPersona = (Persona) obj;
            return this.nombre.equals(otraPersona.nombre) && this.edad == otraPersona.edad;
        }
        return false;
    }
}

// Clase principal que prueba la jerarquía de clases
public class Main {
    public static void main(String[] args) {
        try {
            // Crear un objeto de la clase Coche
            Coche miCoche = new Coche("Toyota", "Corolla", "Rojo");

            // Imprimir la descripción del coche
            System.out.println("Descripción del coche:");
            System.out.println(miCoche.getDescription());

            // Crear objetos de la clase Persona
            Persona persona1 = new Persona("Juan", 30);
            Persona persona2 = new Persona("Juan", 30);

            // Comparar objetos Persona utilizando el método equals()
            System.out.println("\nComparación de personas:");
            System.out.println("persona1 equals persona2: " + persona1.equals(persona2));

            // Provocar una excepción
            throw new FileNotFoundException("Archivo no encontrado");
        } catch (FileNotFoundException e) {
            // Imprimir el mensaje de la excepción
            System.out.println("Se produjo un error: " + e.getMessage());
            // Imprimir la pila de llamadas de la excepción
            e.printStackTrace();
        } finally {
            // Este bloque se ejecutará siempre, independientemente de si hay una excepción o no
            System.out.println("Finalizando...");
        }
    }
}
