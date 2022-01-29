package cwiczenia.c04.zad1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj numer studenta:");
        java.util.Scanner in = new java.util.Scanner (System.in);
        int studentId = in.nextInt();

        System.out.println("Hello s" + studentId);
    }
}
