package items;

import interfaces.ISell;

public class Plectrums extends Item implements ISell {

    public Plectrums(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
