import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Main());
    }

    @Override
    public void run() {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Integrated Example");

        // Establecer operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Crear y agregar componentes básicos
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Username:");
        panel.add(label);
        JTextField textField = new JTextField(10);
        panel.add(textField);
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField(10);
        panel.add(passwordField);
        JButton button = new JButton("Login");
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);

        // Crear y agregar una barra de herramientas
        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Tool 1"));
        toolBar.add(new JButton("Tool 2"));
        frame.add(toolBar, BorderLayout.NORTH);

        // Crear y agregar una barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);

        // Crear y agregar una lista en un JScrollPane
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(data);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane, BorderLayout.EAST);

        // Agregar ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Login button clicked!");
            }
        });

        // Establecer tamaño del marco y hacerlo visible
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
