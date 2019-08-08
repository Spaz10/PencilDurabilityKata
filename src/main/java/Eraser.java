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
        paper.removeText(startIndex, endIndex);

        String noWhiteSpace = textToErase.replace(" ", "");
        this.decreaseDurability(noWhiteSpace.length());
    }

    private void decreaseDurability(int decreaseBy){
        if(this.durability > decreaseBy){
            this.durability -= decreaseBy;
        } else this.durability = 0;
    }

}
