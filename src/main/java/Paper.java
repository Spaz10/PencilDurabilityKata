public class Paper {
    private String text;

    public Paper() {
        this.text = "";
    }

    public String getText(){
        return text;
    }

    public void write(String textToWrite){
        text = textToWrite;
    }
}
