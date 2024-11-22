package hmi.pokemonpacksimulator.packopener.control;

import app.PokemonPackSim.cards.PokemonCard;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class BinderTableModel extends AbstractTableModel {
    private final String[] COLUMN_NAMES = {"Name", "Type", "Rarity"};
    private List<PokemonCard> pokemonCards = new ArrayList<>();

    @Override
    public int getRowCount() {
        return pokemonCards.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PokemonCard pokemonCard = pokemonCards.get(rowIndex);
        switch (columnIndex) {
            case 0: return pokemonCard.getName();
            case 1: return pokemonCard.getType();
            case 2: return pokemonCard.getRarity();
            default: return null;
        }
    }

    public void setPokemonCards(List<PokemonCard> pokemonCards) {
        this.pokemonCards = pokemonCards;
        SwingUtilities.invokeLater(this::fireTableDataChanged);
    }
}
