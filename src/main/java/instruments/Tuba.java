package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Tuba extends Instrument implements IPlay, ISell {
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

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
