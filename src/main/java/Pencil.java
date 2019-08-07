public class Pencil {
    private static final int LOWER_CASE_DEGRADATION_AMOUNT = 1;
    private static final int UPPER_CASE_DEGRADATION_AMOUNT = 2;
    private static final String SPACE = " ";

    private int durability;

    public Pencil(int durability){
        this.durability = durability;
    }

    public void write(Paper paper, String textToWrite) {
        for(Character character: textToWrite.toCharArray()){
            if(this.durability == 0){
                paper.write(SPACE);
            } else paper.write(character.toString());

            if(Character.isLowerCase(character)){
                decreaseDurability(LOWER_CASE_DEGRADATION_AMOUNT);
            } else if(Character.isUpperCase(character)) {
                decreaseDurability(UPPER_CASE_DEGRADATION_AMOUNT);
            }
        }
    }

    public int getDurability(){
        return this.durability;
    }

    private void decreaseDurability(int decreaseBy){
        if(this.durability > decreaseBy){
            this.durability -= decreaseBy;
        } else this.durability = 0;
    }
}
