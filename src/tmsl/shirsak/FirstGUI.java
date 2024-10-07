package tmsl.shirsak;

import javax.swing.*;

public class FirstGUI {
    public static void main(String[] args) {
        // Create a JFrame (window) and set its title
        JFrame frame = new JFrame("GUI Program");

        // Create a JLabel (text label)
        JLabel label = new JLabel("Hello, Me!");

        // Add the label to the frame's content pane
        frame.getContentPane().add(label);

        // Set the default close operation (exit when the window is closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        frame.setSize(300, 200);

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);
    }
}
