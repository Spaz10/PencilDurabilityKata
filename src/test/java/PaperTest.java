import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaperTest {
    @Test
    public void PaperTextDefaultsToEmptyString(){
        Paper paper = new Paper();
        assertEquals("", paper.getText());
    }

    @Test
    public void WritingAppleOnPaperChangesTextToApple(){
        Paper paper = new Paper();
        paper.write("apple");
        assertEquals("apple", paper.getText());
    }

    @Test
    public void WritingASmallSentenceOnPaperChangesTextToTheInputSentence(){
        Paper paper = new Paper();
        paper.write("This is a sentence.");
        assertEquals("This is a sentence.", paper.getText());
    }
}
