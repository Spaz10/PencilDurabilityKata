public class Eraser {

    public void erase(Paper paper, String textToErase) {
        int startIndex = paper.getText().lastIndexOf(textToErase);
        int endIndex = startIndex + textToErase.length();
        paper.removeText(startIndex, endIndex);
    }

}
