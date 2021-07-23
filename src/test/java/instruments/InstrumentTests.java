package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTests {
    BassGuitar bassGuitar;

    @Before
    public void setup() {
        this.bassGuitar = new BassGuitar("Yamaha Jazz", "rosewood", "SLAP", 498.93, 700, 6);
    }

    @Test
    public void hasModel(){
        assertEquals("Yamaha Jazz", bassGuitar.getModel());
    }

    @Test
    public void hasColor(){
        assertEquals("rosewood", bassGuitar.getColor());
    }

    @Test
    public void hasSound(){
        assertEquals("SLAP", bassGuitar.getSound());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(498.93, bassGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(700, bassGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(201.07, bassGuitar.calculateMarkup(), 0.0);
    }
}
