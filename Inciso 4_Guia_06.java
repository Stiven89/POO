import java.util.ArrayList;

// Clase que representa un recurso
class Recurso {
    private String codigo;
    private String nombre;
    private boolean disponible;

    // Constructor
    public Recurso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = true;
    }

    // Método para obtener el código del recurso
    public String getCodigo() {
        return codigo;
    }

    // Método para obtener el nombre del recurso
    public String getNombre() {
        return nombre;
    }

    // Método para verificar si el recurso está disponible
    public boolean estaDisponible() {
        return disponible;
    }

    // Método para prestar el recurso
    public void prestar() {
        disponible = false;
    }

    // Método para devolver el recurso
    public void devolver() {
        disponible = true;
    }
}

// Clase que representa un estudiante
class Estudiante {
    private String codigo;
    private String nombre;

    // Constructor
    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Método para obtener el código del estudiante
    public String getCodigo() {
        return codigo;
    }

    // Método para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }
}

// Clase principal que gestiona los préstamos
public class Main {
    private ArrayList<Recurso> recursos;
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Main() {
        recursos = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    // Método para agregar un recurso
    public void agregarRecurso(String codigo, String nombre) {
        recursos.add(new Recurso(codigo, nombre));
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(String codigo, String nombre) {
        estudiantes.add(new Estudiante(codigo, nombre));
    }

    // Método para prestar un recurso a un estudiante
    public void prestarRecurso(String codigoRecurso, String codigoEstudiante) {
        Recurso recurso = buscarRecurso(codigoRecurso);
        Estudiante estudiante = buscarEstudiante(codigoEstudiante);

        if (recurso != null && estudiante != null) {
            if (recurso.estaDisponible()) {
                recurso.prestar();
                System.out.println("Recurso prestado a " + estudiante.getNombre());
            } else {
                System.out.println("El recurso no está disponible en este momento.");
            }
        } else {
            System.out.println("Recurso o estudiante no encontrado.");
        }
    }

    // Método para devolver un recurso prestado
    public void devolverRecurso(String codigoRecurso) {
        Recurso recurso = buscarRecurso(codigoRecurso);

        if (recurso != null) {
            recurso.devolver();
            System.out.println("Recurso devuelto correctamente.");
        } else {
            System.out.println("Recurso no encontrado.");
        }
    }

    // Método para buscar un recurso por su código
    private Recurso buscarRecurso(String codigo) {
        for (Recurso recurso : recursos) {
            if (recurso.getCodigo().equals(codigo)) {
                return recurso;
            }
        }
        return null;
    }

    // Método para buscar un estudiante por su código
    private Estudiante buscarEstudiante(String codigo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                return estudiante;
            }
        }
        return null;
    }

    // Método principal
    public static void main(String[] args) {
        Main central = new Main();

        // Agregar recursos
        central.agregarRecurso("R001", "Libro de Matemáticas");
        central.agregarRecurso("R002", "Laptop");

        // Agregar estudiantes
        central.agregarEstudiante("E001", "Juan");
        central.agregarEstudiante("E002", "María");

        // Prestar un recurso
        central.prestarRecurso("R001", "E001");

        // Intentar prestar el mismo recurso nuevamente
        central.prestarRecurso("R001", "E002");

        // Devolver un recurso
        central.devolverRecurso("R001");
    }
}
