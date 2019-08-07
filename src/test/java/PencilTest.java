import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {
    private Pencil pencil;
    private Paper paper;
    @Before
    public void setup(){
        pencil =  new Pencil(5);
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
        assertEquals(5, pencil.getDurability());
    }

    @Test
    public void WritingALowercaseLetterDegradesPencilDurabilityByOne(){
        pencil.write(paper, "a");

        assertEquals(4, pencil.getDurability());
    }

    @Test
    public void WritingAnUppercaseLetterDegradesPencilDurabilityByTwo(){
        pencil.write(paper, "A");

        assertEquals(3, pencil.getDurability());
    }
}
