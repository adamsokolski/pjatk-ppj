package cwiczenia.c10.Zadanie2;

public class Main {
    public static void main(String[] args) {
        Jam jam1 = new Jam("Truskawkowy 🍓", 250.0);
        Jam jam2 = new Jam("Wisniowy 🍒");
        Jam jam3 = new Jam(150);

        System.out.println(jam1.getString());
        System.out.println(jam2.getString());
        System.out.println(jam3.getString());
    }
}
