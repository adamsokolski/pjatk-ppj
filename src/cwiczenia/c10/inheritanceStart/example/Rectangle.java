package cwiczenia.c10.inheritanceStart.example;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public String toString() {
        return "Rectangle[Area="+this.getArea()+"]";
    }

}
