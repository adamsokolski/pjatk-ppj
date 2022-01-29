package cwiczenia.c10.Zadanie345;

public class DeciduousTree extends Tree{
    private int leavesShape;

    public DeciduousTree(
            boolean alwaysGreen,
            int height,
            String crossSection,
            int leavesShape
    ) {
        super(alwaysGreen, height, crossSection);
        this.leavesShape = leavesShape;
    }

    @Override
    public String getString() {
        return super.getString() + "\nleavesShape: " + this.leavesShape;
    }

}
