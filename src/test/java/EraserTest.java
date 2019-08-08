import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EraserTest {
    private Eraser eraser;

    @Before
    public void setup(){
        eraser =  new Eraser();
    }

    @Test
    public void EraseReplacesGivenTextWithSpaces(){
        Paper paperWithText = new Paper("Apple Banana Onion");

        eraser.erase(paperWithText, "Banana");

        assertEquals("Apple        Onion", paperWithText.getText());
    }
}
