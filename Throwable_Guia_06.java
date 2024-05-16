public class ThrowableExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Intentamos acceder a un índice fuera de rango
        } catch (Throwable t) { // Capturamos cualquier tipo de error o excepción
            // Imprimimos un mensaje indicando que ocurrió un error y el tipo de error
            System.out.println("Se produjo un error: " + t.getClass().getSimpleName());
            // Imprimimos el mensaje específico de la excepción
            System.out.println("Mensaje de error: " + t.getMessage());
        }
    }
}
