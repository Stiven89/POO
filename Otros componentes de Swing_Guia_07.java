import javax.swing.*;

public class AdvancedComponentsExample {
    public static void main(String[] args) {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Advanced Components Example");

        // Establecer operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear una barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Crear una barra de herramientas
        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Tool 1"));
        toolBar.add(new JButton("Tool 2"));
        frame.add(toolBar, "North");

        // Crear una lista y agregarla a un JScrollPane
        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(data);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane);

        // Establecer el tamaño del marco
        frame.setSize(400, 300);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
