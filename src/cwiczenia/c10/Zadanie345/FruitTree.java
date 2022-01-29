package cwiczenia.c10.Zadanie345;

public class FruitTree extends DeciduousTree {
    private String fruitName;

    public FruitTree(
            boolean alwaysGreen,
            int height,
            String crossSection,
            int leavesShape,
            String fruitName
    ) {
        super(alwaysGreen, height, crossSection, leavesShape);
        this.fruitName = fruitName;
    }

    @Override
    public String getString() {
        return super.getString() + "\nfruitName: " + this.fruitName;
    }
}
