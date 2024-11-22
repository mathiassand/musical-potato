package hmi.pokemonpacksimulator.packopener.model;

import app.PokemonPackSim.cards.BaseSet;
import app.PokemonPackSim.cards.JungleSet;
import app.PokemonPackSim.cards.PokemonCard;
import app.PokemonPackSim.cards.RarityType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PokemonPackSimModel {
    private final List<Runnable> listeners = new ArrayList<>();
    private final List<PokemonCard> binder;
    private final List<PokemonCard> baseSetCards;
    private final List<PokemonCard> jungleCards;

    public PokemonPackSimModel() {
        this.binder = new ArrayList<>();
        this.baseSetCards = BaseSet.getBaseSetCards();
        this.jungleCards = JungleSet.getJungleCards();
    }

    public void openJunglePack() {
        Collections.shuffle(this.jungleCards);
        rollPack(jungleCards);
        notifyListeners();
    }

    public void openBaseSetPack() {
        Collections.shuffle(this.baseSetCards);
        rollPack(baseSetCards);
        notifyListeners();
    }

    private void rollPack(List<PokemonCard> baseSetCards) {
        List<PokemonCard> rareCards = baseSetCards
                .stream()
                .filter(pokemonCard -> pokemonCard.getRarity() == RarityType.RARE)
                .collect(Collectors.toList());

        List<PokemonCard> rareHoloCards = baseSetCards
                .stream()
                .filter(pokemonCard -> pokemonCard.getRarity() == RarityType.RARE_HOLO)
                .collect(Collectors.toList());

        List<PokemonCard> commonCards = baseSetCards
                .stream()
                .filter(pokemonCard -> pokemonCard.getRarity() == RarityType.COMMON
                        || pokemonCard.getRarity() == RarityType.UNCOMMON)
                .collect(Collectors.toList());

        int packSize = 0;

        if (!rareHoloCards.isEmpty() && new Random().nextInt(100) < 5) {
            binder.add(rareHoloCards.get(new Random().nextInt(rareHoloCards.size())));
            packSize++;
        }

        if (!rareCards.isEmpty()) {
            binder.add(rareCards.get(new Random().nextInt(rareCards.size())));
            packSize++;
        }

        Collections.shuffle(commonCards);
        for (int i = 0; i < commonCards.size() && packSize < 5; i++) {
            binder.add(commonCards.get(i));
            packSize++;
        }
    }

    public List<PokemonCard> getBinderCards() {
        return new ArrayList<>(binder);
    }

    public void addListener(Runnable listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        for (Runnable listener : listeners) {
            listener.run();
        }
    }
}
