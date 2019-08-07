import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {
    private Pencil pencil;
    private Paper paper;
    @Before
    public void setup(){
        pencil =  new Pencil(20);
        paper = new Paper();
    }

    @Test
    public void PencilWritesAppleToPaper(){
        pencil.write(paper, "apple");

        assertEquals("apple", paper.getText());
    }

    @Test
    public void TextWrittenByThePencilShouldAlwaysBeAppendedToExistingTextOnThePaper(){
        Paper paperWithText = new Paper("She sells sea shells");
        pencil.write(paperWithText, " down by the sea shore");

        assertEquals("She sells sea shells down by the sea shore", paperWithText.getText());
    }

    @Test
    public void APencilIsCreatedWithAGivenDurability(){
        assertEquals(20, pencil.getPointDurability());
    }

    @Test
    public void WritingALowercaseLetterDegradesPencilDurabilityByOne(){
        pencil.write(paper, "a");

        assertEquals(19, pencil.getPointDurability());
    }

    @Test
    public void WritingAnUppercaseLetterDegradesPencilDurabilityByTwo(){
        pencil.write(paper, "A");

        assertEquals(18, pencil.getPointDurability());
    }

    @Test
    public void WritingLowercaseWordTextWithADurabilityOf4WillWriteTheWholeWord(){
        pencil = new Pencil(4);
        pencil.write(paper, "text");

        assertEquals("text", paper.getText());
        assertEquals(0, pencil.getPointDurability());
    }

    @Test
    public void WritingTextWithACapitalizedLetterTWithADurabilityOf4WillOnlyWriteTex(){
        pencil = new Pencil(4);
        pencil.write(paper, "Text");

        assertEquals("Tex ", paper.getText());
    }
    @Test
    public void WritingSpacesDoesNotDecreaseDurability(){
        pencil.write(paper, "            ");

        assertEquals(20, pencil.getPointDurability());
    }

    @Test
    public void WritingNewLinesDoesNotDecreaseDurability(){
        pencil.write(paper, "\n\n");

        assertEquals(20, pencil.getPointDurability());
    }

    @Test
    public void PencilDurabilityDoesNotDecreasePastZero(){
        Pencil pencilWithLowDurability = new Pencil(1);
        pencilWithLowDurability.write(paper,"Aa");

        assertEquals(0, pencilWithLowDurability.getPointDurability());
    }

    @Test
    public void AfterPencilIsDullAllCharactersAreWrittenAsSpaces(){
        Pencil pencilWithLowDurability = new Pencil(1);
        pencilWithLowDurability.write(paper, "one");

        assertEquals("o  ", paper.getText());
    }

    @Test
    public void WhenAPencilIsSharpenedItRegainsItsInitialPointDurability(){
        pencil.write(paper, "Banana");
        pencil.sharpen();

        assertEquals(20, pencil.getPointDurability());
    }
}
