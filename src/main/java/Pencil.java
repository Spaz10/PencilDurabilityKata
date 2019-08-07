public class Pencil {
    private int durability;

    public Pencil(int durability){
        this.durability = durability;
    }

    public void write(Paper paper, String textToWrite) {
        for(Character character: textToWrite.toCharArray()){
            this.durability--;
            paper.write(character.toString());
        }
        paper.write(textToWrite);
    }

    public int getDurability(){
        return this.durability;
    }
}
