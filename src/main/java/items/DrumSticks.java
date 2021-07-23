package items;

import interfaces.ISell;

public class DrumSticks extends Item implements ISell {

    public DrumSticks(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
