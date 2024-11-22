import hmi.pokemonpacksimulator.packopener.control.PokemonPackSimControl;

import javax.swing.*;

public class NavigationBar extends JMenuBar {
    public NavigationBar(JFrame frame, PokemonPackSimControl pokemonPackSimControl) {
        JMenu viewMenu = new JMenu("Pokemon Pack Simulator");
        this.add(viewMenu);

        // menu items
        JMenuItem pokemonCardSimulatorMenuItem = new JMenuItem("Open packs");

        viewMenu.add(pokemonCardSimulatorMenuItem);

        pokemonCardSimulatorMenuItem.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {
                frame.setContentPane(pokemonPackSimControl.getView());
                refreshFrame(frame);
            });
        });
    }

    private static void refreshFrame(JFrame frame) {
        frame.invalidate();
        frame.validate();
        frame.repaint();
    }
}
