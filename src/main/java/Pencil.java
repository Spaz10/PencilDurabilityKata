public class Pencil {
    private static final int LOWER_CASE_DEGRADATION_AMOUNT = 1;
    private static final int UPPER_CASE_DEGRADATION_AMOUNT = 2;
    private static final int STANDARD_PENCIL_DURABILITY = 20;
    private static final int STANDARD_PENCIL_LENGTH = 5;

    private static final String SPACE = " ";

    private int pointDurability;
    private int maxPointDurability;
    private int length;
    private Eraser eraser;

    public Pencil(){
        this(STANDARD_PENCIL_DURABILITY, STANDARD_PENCIL_LENGTH, Eraser.STANDARD_ERASER_DURABILITY);
    }

    public Pencil(int durability, int length, int eraserDurability){
        this.pointDurability = durability;
        this.maxPointDurability = durability;
        this.length = length;
        this.eraser = new Eraser(eraserDurability);
    }

    public int getPointDurability(){
        return this.pointDurability;
    }

    public int getLength(){
        return this.length;
    }

    public Eraser getEraser(){
        return this.eraser;
    }

    public void write(Paper paper, String textToWrite) {
        for(Character character: textToWrite.toCharArray()){
            if(this.pointDurability == 0){
                paper.write(SPACE);
            } else paper.write(character.toString());

            if(Character.isLowerCase(character)){
                decreaseDurability(LOWER_CASE_DEGRADATION_AMOUNT);
            } else if(Character.isUpperCase(character)) {
                decreaseDurability(UPPER_CASE_DEGRADATION_AMOUNT);
            }
        }
    }

    public void sharpen(){
        this.length --;
        if(this.length >0) this.pointDurability = this.maxPointDurability;
    }

    public void erase(Paper paper, String textToErase){
        this.eraser.erase(paper, textToErase);
    }

    private void decreaseDurability(int decreaseBy){
        if(this.pointDurability > decreaseBy){
            this.pointDurability -= decreaseBy;
        } else this.pointDurability = 0;
    }
}
