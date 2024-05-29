import javax.swing.*;
import java.awt.*;

public class LayoutExample {
    public static void main(String[] args) {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Layout Example");

        // Establecer operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Obtener el panel de contenido y establecer el diseño
        frame.getContentPane().setLayout(new FlowLayout());

        // Crear y agregar botones
        for (int i = 1; i <= 5; i++) {
            frame.getContentPane().add(new JButton("Button " + i));
        }

        // Establecer el tamaño y posición del marco
        frame.setBounds(100, 100, 400, 200);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
