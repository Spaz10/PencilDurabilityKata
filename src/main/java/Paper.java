public class Paper {
    private StringBuilder text;

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
}
