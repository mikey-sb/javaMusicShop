package instruments;

import interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {
    private int stringCount;

    public Guitar(String model, String color, String sound, double buyPrice, double sellPrice, int stringCount) {
        super(model, color, sound, buyPrice, sellPrice);

        this.stringCount = stringCount;
    }

    @Override
    public String playSound() {
        return getSound();
    }

    public int getStringCount() {
        return stringCount;
    }
}
