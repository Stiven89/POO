public class GetMessageExample {
    public static void main(String[] args) {
        try {
            readFile("missing_file.txt"); // Intentamos leer un archivo que no existe
        } catch (FileNotFoundException e) { // Capturamos la excepción de archivo no encontrado
            // Imprimimos el mensaje específico de la excepción
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }

    // Método para simular la lectura de un archivo
    public static void readFile(String filename) throws FileNotFoundException {
        throw new FileNotFoundException("El archivo '" + filename + "' no se encontró"); // Lanzamos una excepción de archivo no encontrado
    }
}
