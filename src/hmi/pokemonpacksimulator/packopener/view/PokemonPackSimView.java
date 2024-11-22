package hmi.pokemonpacksimulator.packopener.view;

import hmi.graphicslibrary.TransparentPanel;
import hmi.graphicslibrary.layouts.KeyValueLayout;
import hmi.graphicslibrary.widgets.TextOutputBean;
import hmi.pokemonpacksimulator.packopener.control.BinderTableModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PokemonPackSimView extends TransparentPanel {
    public static final Dimension PREFERRED_SIZE = new Dimension(400, 0);
    public static final Border EMPTY_BORDER = BorderFactory.createEmptyBorder(10, 10, 10, 10);
    public final JButton openBaseSetPackButton, openJunglePackButton, clearButton;
    public final BinderTableModel binderTableModel;
    public final JPanel detailsPanel, placeholderPanel;
    public final JLabel cardLabel, nameLabel, typeLabel, rarityLabel, holographicLabel, imageLabel;
    public final TextOutputBean nameTextField, typeTextField, rarityTextField, holographicTextField;
    public final JTable binderTable;
    public final JLabel placeholderLabel;

    public PokemonPackSimView() {
        setLayout(new BorderLayout());

        TransparentPanel buttonPanel = new TransparentPanel(new GridLayout(2, 1));
        openBaseSetPackButton = new JButton("Open base set pack");
        openBaseSetPackButton.setPreferredSize(new Dimension(100, 30));
        buttonPanel.add(openBaseSetPackButton);
        openJunglePackButton = new JButton("Open jungle pack");
        openJunglePackButton.setPreferredSize(new Dimension(100, 30));
        buttonPanel.add(openJunglePackButton);
        clearButton = new JButton("Clear binder");
        clearButton.setPreferredSize(new Dimension(100, 30));
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);


        binderTableModel = new BinderTableModel();
        binderTable = new JTable(binderTableModel);
        add(new JScrollPane(binderTable), BorderLayout.CENTER);

        placeholderPanel = new TransparentPanel();
        placeholderPanel.setPreferredSize(PREFERRED_SIZE);
        placeholderLabel = new JLabel("No cards selected");
        placeholderPanel.add(placeholderLabel);
        placeholderPanel.setBorder(EMPTY_BORDER);

        detailsPanel = new TransparentPanel(new KeyValueLayout());
        detailsPanel.setPreferredSize(PREFERRED_SIZE);
        detailsPanel.setBorder(EMPTY_BORDER);

        cardLabel = new JLabel("Card");
        nameLabel = new JLabel("Name");
        typeLabel = new JLabel("Type");
        rarityLabel = new JLabel("Rarity");
        holographicLabel = new JLabel("Holographic");
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        nameTextField = new TextOutputBean();
        typeTextField = new TextOutputBean();
        rarityTextField = new TextOutputBean();
        holographicTextField = new TextOutputBean();

        detailsPanel.add(cardLabel);
        detailsPanel.add(imageLabel);

        detailsPanel.add(nameLabel);
        detailsPanel.add(nameTextField);

        detailsPanel.add(typeLabel);
        detailsPanel.add(typeTextField);

        detailsPanel.add(rarityLabel);
        detailsPanel.add(rarityTextField);

        detailsPanel.add(holographicLabel);
        detailsPanel.add(holographicTextField);

        add(placeholderPanel, BorderLayout.EAST);
    }
}
