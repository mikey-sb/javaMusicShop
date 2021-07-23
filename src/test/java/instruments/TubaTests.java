package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTests {

    Tuba tuba;

    @Before
    public void setup() {
        this.tuba = new Tuba("Wedge", "Solemn Brass", "BWARP", 595.95, 999.95, 20);
    }

    @Test
    public void hasValves(){
        assertEquals(20, tuba.getValveCount());
    }
}

