package cwiczenia.c13.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer (max: " + Integer.MAX_VALUE + "): ");
        int myInt;
        myInt = scanner.nextInt();

        System.out.println("myInt = " + myInt);

    }
}
