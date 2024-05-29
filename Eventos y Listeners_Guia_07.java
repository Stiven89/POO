import javax.swing.*;
import java.awt.event.*;

public class EventListenerExample {
    public static void main(String[] args) {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Event Listener Example");

        // Establecer operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un botón
        JButton button = new JButton("Click Me");

        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        // Agregar un MouseListener al botón
        button.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked on button");
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        // Agregar el botón al marco
        frame.add(button);

        // Establecer el tamaño del marco
        frame.setSize(300, 200);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
