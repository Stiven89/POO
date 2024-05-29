import javax.swing.*;

public class MiscExample implements Runnable {
    public static void main(String[] args) {
        // Usar EventQueue para asegurar que la GUI se construya en el hilo de despacho de eventos
        EventQueue.invokeLater(new MiscExample());
    }

    @Override
    public void run() {
        // Crear un nuevo marco
        JFrame frame = new JFrame("Miscellaneous Example");

        // Establecer operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un menú de edición
        JMenuBar menuBar = new JMenuBar();
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);

        // Establecer el tamaño del marco
        frame.setSize(300, 200);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
