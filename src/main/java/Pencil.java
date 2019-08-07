public class Pencil {
    private int durability;

    public Pencil(int durability){
        this.durability = durability;
    }

    public void write(Paper paper, String textToWrite) {
        paper.write(textToWrite);
    }

    public int getDurability(){
        return this.durability;
    }
}
