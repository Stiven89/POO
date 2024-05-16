public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Intentamos dividir por cero
            System.out.println("Resultado: " + result); // Esta línea nunca se ejecutará
        } catch (ArithmeticException e) { // Capturamos excepciones aritméticas
            // Imprimimos un mensaje indicando el tipo de excepción
            System.out.println("No se puede dividir por cero");
        }
    }

    // Método para dividir dos números
    public static int divide(int dividend, int divisor) {
        return dividend / divisor; // Esta operación puede lanzar una ArithmeticException
    }
}
