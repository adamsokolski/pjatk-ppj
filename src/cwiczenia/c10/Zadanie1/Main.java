package cwiczenia.c10.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Welder welder1 = new Welder("Adam", "Junior");
        Welder welder2 = new Welder("Kazik", "Senior");


        System.out.println(welder1.getString());
        System.out.println(welder2.getString());

    }
}
