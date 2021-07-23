package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTests {

    DrumSticks drumSticks;

    @Before
    public void setup(){
        this.drumSticks = new DrumSticks("Stickys", 2, 10);
    }

    @Test
    public void itemHasName(){
        assertEquals("Stickys", drumSticks.getName());
    }
}
