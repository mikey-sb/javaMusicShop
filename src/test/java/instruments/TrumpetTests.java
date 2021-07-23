package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTests {

    Trumpet trumpet;

    @Before
    public void setup() {
        this.trumpet = new Trumpet("Ritch", "Bright Brass", "TOOT", 264.73, 400, 3);
    }

    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValveCount());
    }
}

