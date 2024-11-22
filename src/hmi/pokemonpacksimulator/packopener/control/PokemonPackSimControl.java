package hmi.pokemonpacksimulator.packopener.control;

import app.PokemonPackSim.cards.PokemonCard;
import hmi.pokemonpacksimulator.packopener.model.PokemonPackSimModel;
import hmi.pokemonpacksimulator.packopener.view.PokemonPackSimView;

import javax.swing.*;
import java.awt.*;

public class PokemonPackSimControl {
    private final PokemonPackSimView view;
    private final PokemonPackSimModel model;

    public PokemonPackSimControl(PokemonPackSimView view, PokemonPackSimModel model) {
        this.view = view;
        this.model = model;

        view.openJunglePackButton.addActionListener(e -> handleJungleOpening());
        view.openBaseSetPackButton.addActionListener(e -> handleBaseSetOpening());
        model.addListener(() -> view.binderTableModel.setPokemonCards(model.getBinderCards()));

        view.binderTable.getSelectionModel().addListSelectionListener(e -> {
            int[] selectedRows = view.binderTable.getSelectedRows();
            if (selectedRows.length > 1) {
                // multiple cards selected
                view.placeholderLabel.setText("Multiple cards selected");
                view.remove(view.detailsPanel);
                view.add(view.placeholderPanel, BorderLayout.EAST);
            } else if (selectedRows.length == 1) {
                PokemonCard pokemonCard = model.getBinderCards().get(selectedRows[0]);
                updateDetails(pokemonCard);
            } else {
                // no selection
                view.placeholderLabel.setText("No card selected");
                view.remove(view.detailsPanel);
                view.add(view.placeholderPanel, BorderLayout.EAST);
            }

            view.revalidate();
            view.repaint();
        });
    }

    private void handleJungleOpening() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                model.openJunglePack();
                return null;
            }
        };
        worker.execute();
    }

    private void handleBaseSetOpening() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                model.openBaseSetPack();
                return null;
            }
        };
        worker.execute();
    }

    public PokemonPackSimView getView() {
        return view;
    }

    public void updateDetails(PokemonCard card) {
        view.remove(view.detailsPanel);
        view.remove(view.placeholderPanel);

        if (card != null) {
            view.nameTextField.setText(card.getName());
            view.typeTextField.setText(card.getType().name());
            view.rarityTextField.setText(card.getRarity().name());
            view.holographicTextField.setText(card.isHolographic() ? "Yes" : "No");

            String imagePath = "/resources/" + card.getName().toLowerCase() + ".png"; // dynamically load
            if (getClass().getResource(imagePath) != null) {
                ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
                Image scaledImage = icon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                view.imageLabel.setIcon(new ImageIcon(scaledImage));
            } else {
                view.imageLabel.setIcon(null);
            }

            view.add(view.detailsPanel, BorderLayout.EAST);
        } else {
            view.add(view.placeholderPanel, BorderLayout.EAST);
        }
        view.revalidate();
        view.repaint();
    }
}
