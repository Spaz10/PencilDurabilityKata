public class Pencil {
    private static final int LOWER_CASE_DEGRADATION_AMOUNT = 1;
    private static final int UPPER_CASE_DEGRADATION_AMOUNT = 2;
    private static final String SPACE = " ";

    private int pointDurability;
    private int maxPointDurability;
    private int length;

    public Pencil(int durability, int length){
        this.pointDurability = durability;
        this.maxPointDurability = durability;
        this.length = length;
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

    public int getPointDurability(){
        return this.pointDurability;
    }
    public int getLength(){
        return this.length;
    }

    public void sharpen(){
        this.pointDurability = this.maxPointDurability;
    }

    private void decreaseDurability(int decreaseBy){
        if(this.pointDurability > decreaseBy){
            this.pointDurability -= decreaseBy;
        } else this.pointDurability = 0;
    }
}
