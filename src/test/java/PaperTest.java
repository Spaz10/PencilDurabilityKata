import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaperTest {
    private Paper paper;

    @Before
    public void setup(){
        paper =  new Paper();
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

    @Test
    public void RemoveTextWillReplaceAnyCharsFromStartIndexToEndIndexWithASpace(){
        Paper paperWithText = new Paper("Apple Banana Onion");

        paperWithText.removeText(6, 12);

        assertEquals("Apple        Onion", paperWithText.getText());
    }

    @Test
    public void WritingTextInTheFirstWhiteSpaceShouldInsertGivenTextIntoFirstViableSpot(){
        Paper paperWithText = new Paper("An       a day keeps the doctor away");

        paperWithText.writeInFirstWhiteSpace("onion");

        assertEquals("An onion a day keeps the doctor away", paperWithText.getText());
    }

    @Test
    public void WritingTextInTheFirstWhiteSpaceWhenTheTextIsLongerThanTheWhiteSpaceOverlapsCharsWithTheAtSymbol(){
        Paper paperWithText = new Paper("An       a day keeps the doctor away");

        paperWithText.writeInFirstWhiteSpace("artichoke");

        assertEquals("An artich@k@ay keeps the doctor away", paperWithText.getText());
    }
}
