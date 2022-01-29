package cwiczenia.c12.task1;

public class ConiferTree extends Tree {
    private int needleQuantity;
    private double coneLength;

    public ConiferTree(
            boolean alwaysGreen,
            int height,
            String crossSection,
            int needleQuantity,
            double coneLength
    ) {
        super(alwaysGreen, height, crossSection);
        this.needleQuantity = needleQuantity;
        this.coneLength = coneLength;
    }

    @Override
    public String getString() {
        return super.getString() + "\nneedleQuantity: " + this.needleQuantity + "\nconeLength: " + this.coneLength;
    }
}
