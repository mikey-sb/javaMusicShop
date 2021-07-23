package instruments;

import interfaces.IPlay;

public class Tuba extends Instrument implements IPlay {
    public int valveCount;

    public Tuba(String model, String color, String sound, double buyPrice, double sellPrice, int valveCount) {
        super(model, color, sound, buyPrice, sellPrice);
        this.valveCount = valveCount;
    }

    @Override
    public String playSound() {
        return null;
    }

    public int getValveCount() {
        return valveCount;
    }
}
