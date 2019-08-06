import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaperTest {
    Paper paper = new Paper();
    @Before
    public void setup(){

    }
    @Test
    public void PaperTextDefaultsToEmptyString(){
        assertEquals("", paper.getText());
    }

    @Test
    public void WritingAppleOnPaperChangesTextToApple(){
        paper.write("apple");
        assertEquals("apple", paper.getText());
    }

    @Test
    public void WritingASmallSentenceOnPaperChangesTextToTheInputSentence(){
        paper.write("This is a sentence.");
        assertEquals("This is a sentence.", paper.getText());
    }

    @Test
    public void PaperIsCreatedWithGivenInputTextWrittenOnIt(){
        Paper paperWithText = new Paper("banana");
        assertEquals("banana", paperWithText.getText());
    }

    @Test
    public void TextWrittenOnThePaperShouldAppendToExistingText(){
        Paper paperWithText = new Paper("She sells sea shells");
        paperWithText.write(" down by the sea shore");

        assertEquals("She sells sea shells down by the sea shore", paperWithText.getText());
    }
}
