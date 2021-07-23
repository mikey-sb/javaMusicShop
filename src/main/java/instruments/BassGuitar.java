package instruments;

import interfaces.IPlay;

public class BassGuitar extends Instrument implements IPlay {
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
}