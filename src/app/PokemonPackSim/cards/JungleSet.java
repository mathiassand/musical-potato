package app.PokemonPackSim.cards;

import java.util.ArrayList;
import java.util.List;

public class JungleSet {
    // TODO images from: https://www.pikawiz.com/cards/jungle
    private static final List<PokemonCard> JUNGLE_CARDS = new ArrayList<>();
    static {
        JUNGLE_CARDS.add(new PokemonCard("Clefable", CardType.NORMAL, RarityType.RARE_HOLO, true));
        JUNGLE_CARDS.add(new PokemonCard("Electrode", CardType.LIGHTNING, RarityType.RARE_HOLO, true));
        JUNGLE_CARDS.add(new PokemonCard("Flareon", CardType.FIRE, RarityType.RARE_HOLO, true));
        JUNGLE_CARDS.add(new PokemonCard("Jolteon", CardType.LIGHTNING, RarityType.RARE_HOLO, true));

        JUNGLE_CARDS.add(new PokemonCard("Snorlax", CardType.NORMAL, RarityType.RARE_HOLO, true));
    }

    public static List<PokemonCard> getJungleCards() {
        return new ArrayList<>(JUNGLE_CARDS);
    }
}
