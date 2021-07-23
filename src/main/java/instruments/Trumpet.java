package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {
    private int valveCount;
    public Trumpet(String model, String color, String sound, double buyPrice, double sellPrice, int valveCount) {
        super(model, color, sound, buyPrice, sellPrice);
        this.valveCount = valveCount;
    }

    public int getValveCount() {
        return valveCount;
    }

    public String playSound(){
        return getSound();
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
