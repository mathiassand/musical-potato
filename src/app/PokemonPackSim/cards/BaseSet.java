package app.PokemonPackSim.cards;

import java.util.ArrayList;
import java.util.List;

public class BaseSet {
    // TODO for images: https://www.pikawiz.com/cards/baseset
    private static final List<PokemonCard> BASE_SET_CARDS = new ArrayList<>();

    static {
        // data based on: https://bulbapedia.bulbagarden.net/wiki/Base_Set_(TCG)
        BASE_SET_CARDS.add(new PokemonCard("Alakazam", CardType.PSYCHIC, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Blastoise", CardType.WATER, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Chansey", CardType.COLORLESS, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Charizard", CardType.FIRE, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Clefairy", CardType.COLORLESS, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Gyarados", CardType.WATER, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Hitmonchan", CardType.FIGHTING, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Machamp", CardType.FIGHTING, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Magneton", CardType.LIGHTNING, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Mewtwo", CardType.PSYCHIC, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Nidoking", CardType.GRASS, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Ninetales", CardType.FIRE, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Poliwrath", CardType.WATER, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Raichu", CardType.LIGHTNING, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Venusaur", CardType.GRASS, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Zapdos", CardType.LIGHTNING, RarityType.RARE_HOLO, true));
        BASE_SET_CARDS.add(new PokemonCard("Beedrill", CardType.GRASS, RarityType.RARE, false));
        BASE_SET_CARDS.add(new PokemonCard("Dragonair", CardType.COLORLESS, RarityType.RARE, false));
        BASE_SET_CARDS.add(new PokemonCard("Dugtrio", CardType.FIGHTING, RarityType.RARE, false));
        BASE_SET_CARDS.add(new PokemonCard("Electabuzz", CardType.LIGHTNING, RarityType.RARE, false));
        BASE_SET_CARDS.add(new PokemonCard("Electrode", CardType.LIGHTNING, RarityType.RARE, false));
        BASE_SET_CARDS.add(new PokemonCard("Pidgeotto", CardType.COLORLESS, RarityType.RARE, false));
        BASE_SET_CARDS.add(new PokemonCard("Arcanine", CardType.FIRE, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Charmeleon", CardType.FIRE, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Dewgong", CardType.WATER, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Dratini", CardType.COLORLESS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Farfetch'd", CardType.COLORLESS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Growlithe", CardType.FIRE, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Haunter", CardType.PSYCHIC, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Ivysaur", CardType.GRASS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Jynx", CardType.PSYCHIC, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Kadabra", CardType.PSYCHIC, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Kakuna", CardType.GRASS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Machoke", CardType.FIGHTING, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Magikarp", CardType.WATER, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Magmar", CardType.FIRE, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Nidorino", CardType.GRASS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Poliwhirl", CardType.WATER, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Porygon", CardType.COLORLESS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Raticate", CardType.COLORLESS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Seel", CardType.WATER, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Wartortle", CardType.WATER, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Abra", CardType.PSYCHIC, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Bulbasaur", CardType.GRASS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Caterpie", CardType.GRASS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Charmander", CardType.FIRE, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Diglett", CardType.FIGHTING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Doduo", CardType.COLORLESS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Drowzee", CardType.PSYCHIC, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Gastly", CardType.PSYCHIC, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Koffing", CardType.GRASS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Machop", CardType.FIGHTING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Magnemite", CardType.LIGHTNING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Metapod", CardType.GRASS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Nidoran", CardType.GRASS, RarityType.COMMON, false)); // todo Nidoran♀
        BASE_SET_CARDS.add(new PokemonCard("Onix", CardType.FIGHTING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Pidgey", CardType.COLORLESS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Pikachu", CardType.LIGHTNING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Poliwag", CardType.WATER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Ponyta", CardType.FIRE, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Rattata", CardType.COLORLESS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Sandshrew", CardType.FIGHTING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Squirtle", CardType.WATER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Starmie", CardType.WATER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Staryu", CardType.WATER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Tangela", CardType.GRASS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Voltorb", CardType.LIGHTNING, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Vulpix", CardType.FIRE, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Weedle", CardType.GRASS, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Bill", CardType.TRAINER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Energy Removal", CardType.TRAINER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Gust of Wind", CardType.TRAINER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Potion", CardType.TRAINER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Switch", CardType.TRAINER, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Double Colorless Energy", CardType.COLORLESS, RarityType.UNCOMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Fighting Energy", CardType.ENERGY, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Fire Energy", CardType.ENERGY, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Grass Energy", CardType.ENERGY, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Lightning Energy", CardType.ENERGY, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Psychic Energy", CardType.ENERGY, RarityType.COMMON, false));
        BASE_SET_CARDS.add(new PokemonCard("Water Energy", CardType.ENERGY, RarityType.COMMON, false));
    }

    public static List<PokemonCard> getBaseSetCards() {
        // returns a copy to avoid modification
        return new ArrayList<>(BASE_SET_CARDS);
    }
}
