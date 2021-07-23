package instruments;

import interfaces.IPlay;

public class Trombone extends Instrument implements IPlay {

    private int valveCount;
    public Trombone(String model, String color, String sound, double buyPrice, double sellPrice, int valveCount) {
        super(model, color, sound, buyPrice, sellPrice);
        this.valveCount = valveCount;
    }

    public int getValveCount() {
        return valveCount;
    }

    @Override
    public String playSound() {
        return getSound();
    }
}
