public class Eraser {
    public static final int STANDARD_ERASER_DURABILITY = 5;

    private int durability;

    public Eraser(){
       this(STANDARD_ERASER_DURABILITY);
    }

    public Eraser(int durability){
        this.durability = durability;
    }

    public int getDurability() {
        return this.durability;
    }

    public void erase(Paper paper, String textToErase) {
        int startIndex = paper.getText().lastIndexOf(textToErase);
        int endIndex = startIndex + textToErase.length();

        if(textToErase.length() > this.durability){
            startIndex += (textToErase.length() - this.durability);
        }
        paper.removeText(startIndex, endIndex);

        String noWhiteSpace = textToErase.replaceAll("\\s+","");
        this.durability = Math.max(0, this.durability - noWhiteSpace.length());
    }

}
