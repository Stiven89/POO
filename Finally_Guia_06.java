public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Dentro del try");
        } finally {
            System.out.println("Finalizando..."); // Se ejecutará sin importar si hay excepciones o no
        }
    }
}
