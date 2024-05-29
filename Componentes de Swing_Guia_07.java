import javax.swing.*;

public class SimpleComponentsExample {
    public static void main(String[] args) {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Simple Components Example");

        // Establecer operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear y agregar una etiqueta
        JLabel label = new JLabel("Username:");
        panel.add(label);

        // Crear y agregar un campo de texto
        JTextField textField = new JTextField(20);
        panel.add(textField);

        // Crear y agregar una etiqueta para contraseña
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        // Crear y agregar un campo de contraseña
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField);

        // Crear y agregar un botón
        JButton button = new JButton("Login");
        panel.add(button);

        // Agregar el panel al marco
        frame.add(panel);

        // Establecer el tamaño del marco
        frame.setSize(300, 200);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
