package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTests {

    Trombone trombone;

    @Before
    public void setup() {
        this.trombone = new Trombone("Cassidy", "Mellow Brass", "TOOOOOOT", 444.73, 700, 12);
    }

    @Test
    public void hasValves(){
        assertEquals(12, trombone.getValveCount());
    }
}

