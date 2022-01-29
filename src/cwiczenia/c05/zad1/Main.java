package cwiczenia.c05.zad1;

public class Main {
    public static void main(String[] args) {
        int myInt = 75;
        for (int i = myInt; i <= 150; i++) {

            System.out.println(myInt + " - " + (char)(myInt++));
        }
    }
}
