package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTests {
    Guitar guitar;

    @Before
    public void setup() {
        this.guitar = new Guitar("Cole Clarke", "Australian Maple", "STRUM", 757.38, 1199.95, 6);
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStringCount());
    }
}
