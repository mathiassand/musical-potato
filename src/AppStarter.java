import hmi.graphicslibrary.TransparentPanel;
import hmi.graphicslibrary.layouts.KeyValueLayout;

import javax.swing.*;

public class AppStarter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            TransparentPanel panel = new TransparentPanel(new KeyValueLayout());
            panel.add(new JLabel("Hello World!"));
            panel.add(new JButton("Button"));
            panel.add(new JLabel("Hello World!"));
            panel.add(new JButton("Button"));
            panel.add(new JLabel("Hello World!"));
            panel.add(new JButton("Button"));
            panel.add(new JLabel("Hello World!"));
            panel.add(new JButton("Button"));
            panel.add(new JLabel("Hello World!"));
            panel.add(new JButton("Button"));
            frame.setContentPane(panel);
        });
    }
}