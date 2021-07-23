package instruments;

import interfaces.IPlay;

public class Violin extends Instrument implements IPlay {
    private int stringCount;
    public Violin(String model, String color, String sound, double buyPrice, double sellPrice, int stringCount) {
        super(model, color, sound, buyPrice, sellPrice);

        this.stringCount = stringCount;
    }

    @Override
    public String playSound() {
        return null;
    }

    public int getStringCount() {
        return stringCount;
    }
}
