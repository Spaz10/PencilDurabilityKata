import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {
    @Test
    public void PencilWritesAppleToPaper(){
        Paper paper = new Paper();
        Pencil pencil = new Pencil();
        pencil.write(paper, "apple");

        assertEquals("apple", paper.getText());
    }
}
