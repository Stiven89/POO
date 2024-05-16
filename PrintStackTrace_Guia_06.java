public class PrintStackTraceExample {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]); // Intentamos acceder a un índice inválido
        } catch (ArrayIndexOutOfBoundsException e) { // Capturamos excepciones de índice fuera de rango
            // Imprimimos la pila de llamadas y el mensaje de la excepción
            System.out.println("Se produjo un error:");
            e.printStackTrace();
        }
    }
}
