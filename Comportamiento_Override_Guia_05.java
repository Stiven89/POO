// Clase Persona que representa a una persona con un nombre
class Persona {
    private String nombre; // Nombre de la persona

    // Constructor de la clase Persona
    public Persona(String nombre) {
        this.nombre = nombre; // Inicialización del nombre
    }

    // Método para saludar, un comportamiento de la persona
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    // Método equals para comparar personas basado en su nombre
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona) { // Verifica si el objeto es una instancia de Persona
            Persona otraPersona = (Persona) obj; // Casteo del objeto a Persona
            return this.nombre.equals(otraPersona.nombre); // Comparación de nombres
        }
        return false; // Si el objeto no es una instancia de Persona, retorna false
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación de objetos de la clase Persona
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Juan");
        Persona persona3 = new Persona("Pedro");

        // Saludo de la persona1
        persona1.saludar();

        // Comparación de personas utilizando el método equals
        System.out.println(persona1.equals(persona2)); // Devuelve true si tienen el mismo nombre
        System.out.println(persona1.equals(persona3)); // Devuelve false si tienen nombres diferentes
    }
}
