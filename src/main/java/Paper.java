public class Paper {
    private StringBuilder text;
    private static final char SPACE = ' ';

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

    public void removeText(int startIndex, int endIndex){
        for(int i = startIndex; i<endIndex; i++){
            text.setCharAt(i, SPACE);
        }
    }

}
