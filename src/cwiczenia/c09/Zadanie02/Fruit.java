package cwiczenia.c09.Zadanie02;
import java.util.Random;

public class Fruit {
    String name;
    double weigth;

    public Fruit(String name) {
        this.name = name;
        this.weigth = new Random().nextDouble(0.5, 0.8);
    }
    public Fruit(){}

    public static void show(Fruit f) {
        System.out.println("name = " + f.name + " weight = " + f.weigth);
    }
    public void show() {
        System.out.println("name = " + this.name + " weight = " + this.weigth);
    }
}
