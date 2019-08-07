import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {
    private Pencil pencil = new Pencil(5);

    @Before
    public void setup(){
        pencil =  new Pencil(5);
    }
    @Test
    public void PencilWritesAppleToPaper(){
        Paper paper = new Paper();
        pencil.write(paper, "apple");

        assertEquals("apple", paper.getText());
    }

    @Test
    public void TextWrittenByThePencilShouldAlwaysBeAppendedToExistingTextOnThePaper(){
        Paper paper = new Paper("She sells sea shells");
        pencil.write(paper, " down by the sea shore");

        assertEquals("She sells sea shells down by the sea shore", paper.getText());
    }

    @Test
    public void APencilIsCreatedWithAGivenDurability(){
        assertEquals(5, pencil.getDurability());
    }
}
