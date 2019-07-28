import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaperTest {
    @Test
    public void PaperTextDefaultsToEmptyString(){
        Paper paper = new Paper();
        assertEquals("", paper.getText());
    }
}
