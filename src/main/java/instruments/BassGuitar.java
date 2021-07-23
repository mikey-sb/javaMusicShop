package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class BassGuitar extends Instrument implements IPlay, ISell {
    private int stringCount;

    public BassGuitar(String model, String color, String sound, double buyPrice, double sellPrice, int stringCount) {
        super(model, color, sound, buyPrice, sellPrice);

        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    @Override
    public String playSound() {
        return getSound();
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
