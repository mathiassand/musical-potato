import com.formdev.flatlaf.FlatDarculaLaf;
import hmi.graphicslibrary.TransparentPanel;
import hmi.graphicslibrary.layouts.KeyValueLayout;

import javax.swing.*;

public class AppStarter {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException("Failed to initialize FlatLaf", e);
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            EDT.invokeOnEDT(() -> {
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
        });
    }
}