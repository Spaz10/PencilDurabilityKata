import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class EraserTest {
    private Eraser eraser;

    @Before
    public void setup(){
        eraser =  new Eraser(10);
    }

    @Test
    public void EraseReplacesGivenTextWithSpaces(){
        Paper paperWithText = new Paper("Apple Banana Onion");

        eraser.erase(paperWithText, "Banana");

        assertEquals("Apple        Onion", paperWithText.getText());
    }

    @Test
    public void EraseReplacesLastOccurrenceOfAWordWithSPaces(){
        Paper paperWithText = new Paper("How much wood would a woodchuck chuck if a woodchuck could chuck wood?");

        eraser.erase(paperWithText, "chuck");

        assertEquals("How much wood would a woodchuck chuck if a woodchuck could       wood?", paperWithText.getText());
    }

    @Test
    public void ErasingAWordASecondTimeWillReplaceTheNextLastOccurrenceOfTheWord(){
        Paper paperWithText = new Paper("How much wood would a woodchuck chuck if a woodchuck could chuck wood?");

        eraser.erase(paperWithText, "chuck");
        eraser.erase(paperWithText, "chuck");

        assertEquals("How much wood would a woodchuck chuck if a wood      could       wood?", paperWithText.getText());
    }

    @Test
    public void AnEraserIsCreatedWithAGivenDurability(){
        Eraser eraser = new Eraser(10);

        assertEquals(10, eraser.getDurability());
    }

    @Test
    public void ErasingNonWhiteSpaceCharactersDecreasesDurabilityByOne(){
        Paper paperWithText = new Paper("Apple Banana Onion");

        eraser.erase(paperWithText, "n");

        assertEquals(9, eraser.getDurability());
    }

    @Test
    public void ErasingWhiteSpaceCharactersDoesNotDecreaseDurability(){
        Paper paperWithText = new Paper("Apple Banana Onion");

        eraser.erase(paperWithText, "a O");

        assertEquals(8, eraser.getDurability());
    }

    @Test
    public void ErasingNewLineCharactersDoesNotDecreaseDurability(){
        Paper paperWithText = new Paper("Apple Banana O\nnion");

        eraser.erase(paperWithText, "a O\n");

        assertEquals(8, eraser.getDurability());
    }

    @Test
    public void TextShouldBeErasedLeftToRightOnceAnEraserDurabilityReachesZeroItCanNoLongerErase(){
        Paper paperWithText = new Paper("Buffalo Bill");
        Eraser eraserWithLowDurability = new Eraser(3);

        eraserWithLowDurability.erase(paperWithText, "Bill");

        assertEquals("Buffalo B   ", paperWithText.getText());
    }
}
