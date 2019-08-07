import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {
    @Test
    public void PencilWritesAppleToPaper(){
        Paper paper = new Paper();
        Pencil pencil = new Pencil(5);
        pencil.write(paper, "apple");

        assertEquals("apple", paper.getText());
    }

    @Test
    public void TextWrittenByThePencilShouldAlwaysBeAppendedToExistingTextOnThePaper(){
        Paper paper = new Paper("She sells sea shells");
        Pencil pencil = new Pencil(5);
        pencil.write(paper, " down by the sea shore");

        assertEquals("She sells sea shells down by the sea shore", paper.getText());
    }

    @Test
    public void APencilIsCreatedWithAGivenDurability(){
        Pencil pencil = new Pencil(5);
        assertEquals(5, pencil.getDurability());
    }
}
