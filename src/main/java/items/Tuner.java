package items;

import interfaces.ISell;

public class Tuner extends Item implements ISell {

    public Tuner(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
