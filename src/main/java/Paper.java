public class Paper {
    private StringBuilder text;
    private static final char SPACE = ' ';
    private static final char OVERLAP_SYMBOL = '@';

    public Paper() {
        this.text = new StringBuilder("");
    }

    public Paper(String startText) {
        this.text = new StringBuilder(startText);
    }

    public String getText(){
        return text.toString();
    }

    public void write(String textToWrite){
        text.append(textToWrite);
    }

    public void writeInFirstWhiteSpace(String textToWrite){
        int indexOfWhiteSpace = this.text.indexOf("   ") + 1;
        int indexOfEndChar = indexOfWhiteSpace + textToWrite.length();

        for(int i = indexOfWhiteSpace; i < indexOfEndChar; i++){
            if(Character.isWhitespace(this.text.charAt(i))){
                this.text.setCharAt(i, textToWrite.charAt(0));

            } else this.text.setCharAt(i, OVERLAP_SYMBOL);
            textToWrite = textToWrite.substring(1);
        }
    }

    public void removeText(int startIndex, int endIndex){
        for(int i = startIndex; i<endIndex; i++){
            text.setCharAt(i, SPACE);
        }
    }

}
