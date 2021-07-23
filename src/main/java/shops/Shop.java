package shops;

import interfaces.ISell;
import items.DrumSticks;

import java.util.ArrayList;

public class Shop {
    ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStock(ISell product) {
        this.stock.add(product);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void removeStock(ISell product) {
        this.stock.remove(product);
    }
}
