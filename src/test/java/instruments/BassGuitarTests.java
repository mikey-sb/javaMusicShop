package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTests {
    BassGuitar bassGuitar;

    @Before
    public void setup() {
        this.bassGuitar = new BassGuitar("Yamaha Jazz", "rosewood", "SLAP", 498.93, 700, 4);
    }

    @Test
    public void hasStringCount(){
        assertEquals(4, bassGuitar.getStringCount());
    }

}
