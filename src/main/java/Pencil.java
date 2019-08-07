public class Pencil {
    private static final int LOWER_CASE_DEGRADATION_AMOUNT = 1;
    private static final int UPPER_CASE_DEGRADATION_AMOUNT = 2;

    private int durability;

    public Pencil(int durability){
        this.durability = durability;
    }

    public void write(Paper paper, String textToWrite) {
        for(Character character: textToWrite.toCharArray()){
            if(durability<1) break;

            if(Character.isLowerCase(character)){
                decreaseDurability(LOWER_CASE_DEGRADATION_AMOUNT);
            } else if(Character.isUpperCase(character)) {
                decreaseDurability(UPPER_CASE_DEGRADATION_AMOUNT);
            }
            paper.write(character.toString());
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
