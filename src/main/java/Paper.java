public class Paper {
    private String text;

    public Paper() {
        this.text = "";
    }

    public Paper(String startText) {
        this.text = startText;
    }

    public String getText(){
        return text;
    }

    public void write(String textToWrite){
        text = textToWrite;
    }
}
