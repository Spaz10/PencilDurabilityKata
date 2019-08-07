public class Pencil {
    private int durability;

    public Pencil(int durability){
        this.durability = durability;
    }

    public void write(Paper paper, String textToWrite) {
        for(Character character: textToWrite.toCharArray()){
            if(Character.isLowerCase(character)){
                this.durability--;
            } else if(Character.isUpperCase(character)) {
                this.durability -= 2;
            }
            paper.write(character.toString());
        }
    }

    public int getDurability(){
        return this.durability;
    }
}
