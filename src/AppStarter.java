import com.formdev.flatlaf.FlatDarculaLaf;
import hmi.pokemonpacksimulator.packopener.control.PokemonPackSimControl;
import hmi.pokemonpacksimulator.packopener.model.PokemonPackSimModel;
import hmi.pokemonpacksimulator.packopener.view.PokemonPackSimView;

import javax.swing.*;

public class AppStarter {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException("Failed to initialize FlatLaf", e);
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pokemon Pack Simulator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            PokemonPackSimModel pokemonPackSimModel = new PokemonPackSimModel();

            PokemonPackSimView pokemonPackSimView = new PokemonPackSimView();
            PokemonPackSimControl pokemonPackSimControl = new PokemonPackSimControl(pokemonPackSimView, pokemonPackSimModel);

            EDT.invokeOnEDT(() -> frame.setContentPane(pokemonPackSimView));
            frame.setVisible(true);
        });
    }
}