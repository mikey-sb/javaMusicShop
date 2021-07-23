package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTests {
    Violin violin;

    @Before
    public void setup() {
        this.violin = new Violin("Cole Clarke", "Australian Maple", "STRUM", 757.38, 1199.95, 4);
    }

    @Test
    public void hasStrings(){
        assertEquals(4, violin.getStringCount());
    }
}
