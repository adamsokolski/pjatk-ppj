package cwiczenia.c04.zad11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj n:");
        java.util.Scanner in = new java.util.Scanner(System.in) ;
        int n = in.nextInt () ;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j + "\t\t");
            }
            System.out.println();
        }
    }
}
