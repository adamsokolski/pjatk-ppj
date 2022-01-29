package cwiczenia.c10.inheritanceStart.example;

public class Cuboid extends Rectangle{
    private final double height;

    public Cuboid(double sideA, double sideB, double height) {
        super(sideA, sideB);
        this.height = height;
    }

    public Cuboid(Rectangle rectangle, double height) {
        this(rectangle.getSideA(), rectangle.getSideB(), height);
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override
    public double getArea() {
        return 2*super.getArea()+
                2*this.height*this.getSideA()+
                2*this.height*this.getSideB();
    }

    @Override
    public String toString() {
        return "Cuboid[Area=" + this.getArea() + ", Volume=" + this.getVolume() + "]";
    }
}
