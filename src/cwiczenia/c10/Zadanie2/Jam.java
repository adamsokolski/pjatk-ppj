package cwiczenia.c10.Zadanie2;

public class Jam {
    private String taste;
    private double weight;

    public Jam(String taste, double weight) {
        this.taste = taste;
        this.weight = weight;
    }

    public Jam(double weight) {
        this("No name", weight);
    }

    public Jam(String taste) {
        this(taste, 100.0);
    }

    public String getString() {
        return "Dzem " + this.taste + ", waga: " + this.weight + "g";
    }
}
