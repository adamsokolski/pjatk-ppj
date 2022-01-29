package cwiczenia.c12.task1;

public class Tree {
    private boolean alwaysGreen;
    private int height;
    private String crossSection;

    public Tree(boolean alwaysGreen, int height, String crossSection) {
        this.alwaysGreen = alwaysGreen;
        this.height = height;
        this.crossSection = crossSection;
    }

    public String getString() {
        return "alwaysGreen: " + this.alwaysGreen + "\nheight: " + this.height + "\ncrossSection: " + this.crossSection;
    }
}
