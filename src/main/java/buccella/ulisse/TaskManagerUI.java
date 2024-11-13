package buccella.ulisse;

import javax.swing.*;

public class TaskManagerUI {
    public static void main(String[] args) {
        // Establecer la interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            // Crear la ventana
            JFrame frame = new JFrame("Task Manager");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Crear un botón
            JButton button = new JButton("Click me");
            frame.add(button); // Agregar el botón a la ventana

            // Hacer la ventana visible
            frame.setVisible(true);
        });
    }
}
