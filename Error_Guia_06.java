public class ErrorExample {
    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError("Memory is full"); // Lanzamos un error de falta de memoria
        } catch (Error e) { // Capturamos cualquier tipo de error
            // Imprimimos un mensaje indicando que ocurrió un error y el tipo de error
            System.out.println("Se produjo un error: " + e.getClass().getSimpleName());
            // Imprimimos el mensaje específico del error
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}
