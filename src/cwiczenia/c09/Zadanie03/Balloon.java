package cwiczenia.c09.Zadanie03;

import java.util.Random;

public class Balloon {
    double capacity;

    public Balloon() {
        this.capacity = new Random().nextDouble(0.005, 0.009);
    }

    public double getLoad() {
        double load = 0.007 / (6 / this.capacity);
        System.out.println("load = " + load + "g");
        return load;
    }
}
