// Clase Persona con atributos de diferentes niveles de acceso
class Persona {
    private String nombre; // Atributo privado
    protected int edad; // Atributo protegido
    public String genero; // Atributo público

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre; // Inicialización del nombre
        this.edad = edad; // Inicialización de la edad
        this.genero = genero; // Inicialización del género
    }

    // Método público para obtener el nombre
    public String getNombre() {
        return nombre;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30, "Masculino");

        // Acceso a los atributos y método de la clase Persona desde Main
        System.out.println(persona.getNombre()); // Acceso al atributo privado a través de un método público
        System.out.println(persona.edad); // Acceso al atributo protegido directamente
        System.out.println(persona.genero); // Acceso al atributo público directamente
    }
}
