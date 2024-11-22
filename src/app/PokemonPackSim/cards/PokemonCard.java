package app.PokemonPackSim.cards;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class PokemonCard implements Externalizable {
    private String name;
    private CardType type;
    private RarityType rarity;
    private boolean holographic;

    /**
     * This is only for externalizable
     */
    public PokemonCard() {
    }

    public PokemonCard(String name, CardType type, RarityType rarity, boolean holographic) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.holographic = holographic;
    }

    public String getName() {
        return name;
    }

    public CardType getType() {
        return type;
    }

    public RarityType getRarity() {
        return rarity;
    }

    public boolean isHolographic() {
        return holographic;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeObject(type);
        out.writeObject(rarity);
        out.writeBoolean(holographic);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        type = (CardType) in.readObject();
        rarity = (RarityType) in.readObject();
        holographic = in.readBoolean();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PokemonCard that = (PokemonCard) o;
        return holographic == that.holographic && Objects.equals(name, that.name) && type == that.type && rarity == that.rarity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, rarity, holographic);
    }

    @Override
    public String toString() {
        return "PokemonCard{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", rarity='" + rarity + '\'' +
                ", holographic=" + holographic +
                '}';
    }
}
