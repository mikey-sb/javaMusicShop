package items;

import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;
import shops.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTests {

    Shop shop;
    ArrayList<ISell> stock;
    DrumSticks drumSticks;

    @Before
    public void setup(){
        this.shop = new Shop(stock);
        this.drumSticks = new DrumSticks("Stickys", 2, 10);
    }

    @Test
    public void hasAddedStock(){
        shop.addStock(drumSticks);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void hasRemoveStock(){
        shop.addStock(drumSticks);
        shop.removeStock(drumSticks);
        assertEquals(0, shop.getStock().size());
    }
}
