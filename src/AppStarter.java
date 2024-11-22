import app.PokemonPackSim.cards.PokemonCard;
import com.formdev.flatlaf.FlatDarculaLaf;
import hmi.pokemonpacksimulator.packopener.control.PokemonPackSimControl;
import hmi.pokemonpacksimulator.packopener.model.PokemonPackSimModel;
import hmi.pokemonpacksimulator.packopener.view.PokemonPackSimView;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AppStarter {
    private static final String DATA_FILE_PATH = "binder_data.dat";

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

            List<PokemonCard> loadedPokemonCards = loadBinderFromFile();
            if (!loadedPokemonCards.isEmpty()) {
                pokemonPackSimModel.setBinderCars(loadedPokemonCards);
                pokemonPackSimView.binderTableModel.setPokemonCards(loadedPokemonCards);
            }

            EDT.invokeOnEDT(() -> frame.setContentPane(pokemonPackSimView));

            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    saveBinderToFile(pokemonPackSimModel.getBinderCards());
                    System.out.println("Binder saved successfully");
                    System.exit(0);
                }
            });

            frame.setVisible(true);
        });
    }

    private static List<PokemonCard> loadBinderFromFile() {
        File file = new File(AppStarter.DATA_FILE_PATH);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(AppStarter.DATA_FILE_PATH)))) {
                List<PokemonCard> pokemonCards = (List<PokemonCard>) ois.readObject();
                System.out.println("Binder loaded successfully");
                return pokemonCards;
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException("Failed to load binder from file", e);
            }
        } else {
            System.out.println("No existing data file found. Binder is empty.");
        }
        return new ArrayList<>();
    }

    private static void saveBinderToFile(List<PokemonCard> binder) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(AppStarter.DATA_FILE_PATH)))) {
            oos.writeObject(binder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}