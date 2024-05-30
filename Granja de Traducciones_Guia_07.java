import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FarmAnimalsApp extends JFrame {
    // Mapa para almacenar los nombres de los animales y sus imágenes
    private Map<String, ImageIcon> animals;
    private String currentAnimal;
    private int score;

    // Componentes de la interfaz
    private JLabel animalNameLabel;
    private JLabel feedbackLabel;
    private JLabel scoreLabel;

    public FarmAnimalsApp() {
        // Inicializar el mapa de animales y cargar los datos
        animals = new HashMap<>();
        loadAnimals();
        score = 0;

        // Configurar la ventana principal
        setTitle("Aprende los nombres de los animales de la granja");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior para mostrar el nombre del animal actual
        JPanel topPanel = new JPanel();
        animalNameLabel = new JLabel("");
        topPanel.add(animalNameLabel);

        // Panel central para los botones con las imágenes de los animales
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));
        for (String animal : animals.keySet()) {
            JButton animalButton = new JButton(animal);
            animalButton.setIcon(animals.get(animal));
            animalButton.addActionListener(new AnimalButtonListener(animal));
            centerPanel.add(animalButton);
        }

        // Panel inferior para mostrar retroalimentación y puntaje
        JPanel bottomPanel = new JPanel();
        feedbackLabel = new JLabel("Selecciona un animal");
        scoreLabel = new JLabel("Puntaje: 0");
        bottomPanel.add(feedbackLabel);
        bottomPanel.add(scoreLabel);

        // Agregar los paneles a la ventana principal
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Iniciar la primera ronda
        startNewRound();
    }

    // Cargar los datos de los animales
    private void loadAnimals() {
        animals.put("Cow", new ImageIcon("images/cow.jpg"));
        animals.put("Sheep", new ImageIcon("images/sheep.jpg"));
        animals.put("Pig", new ImageIcon("images/pig.jpg"));
        animals.put("Chicken", new ImageIcon("images/chicken.jpg"));
        // Agrega más animales aquí con sus respectivas imágenes
    }

    // Iniciar una nueva ronda seleccionando un animal aleatorio
    private void startNewRound() {
        Object[] animalNames = animals.keySet().toArray();
        currentAnimal = (String) animalNames[new Random().nextInt(animalNames.length)];
        animalNameLabel.setText(currentAnimal);
        feedbackLabel.setText("Selecciona el animal correcto");
    }

    // Clase interna para manejar los eventos de los botones
    private class AnimalButtonListener implements ActionListener {
        private String animal;

        public AnimalButtonListener(String animal) {
            this.animal = animal;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (animal.equals(currentAnimal)) {
                score += 20;
                feedbackLabel.setText("¡Correcto! El animal es " + animal);
            } else {
                feedbackLabel.setText("Incorrecto. Era " + currentAnimal);
            }
            scoreLabel.setText("Puntaje: " + score);
            startNewRound();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FarmAnimalsApp().setVisible(true);
            }
        });
    }
}
