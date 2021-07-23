package items;

import interfaces.ISell;

public class SheetMusic extends Item implements ISell {

    public SheetMusic(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }


    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
