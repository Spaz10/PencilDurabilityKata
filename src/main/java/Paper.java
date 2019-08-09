public class Paper {
    private static final char SPACE = ' ';
    private static final char OVERLAP_SYMBOL = '@';

    private StringBuilder text;
    private int indexOfLastErase;

    public Paper() {
        this.text = new StringBuilder("");
    }

    public Paper(String startText) {
        this.text = new StringBuilder(startText);
    }

    public String getText(){
        return text.toString();
    }

    public int getIndexOfLastErase() {
        return indexOfLastErase;
    }

    public void setIndexOfLastErase(int indexOfLastErase) {
        this.indexOfLastErase = indexOfLastErase;
    }

    public void write(String textToWrite){
        text.append(textToWrite);
    }

    public void writeInIndexOfErase(String textToWrite){
        int indexOfEndChar = this.indexOfLastErase + textToWrite.length();

        for(int i = this.indexOfLastErase; i < indexOfEndChar; i++){
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
