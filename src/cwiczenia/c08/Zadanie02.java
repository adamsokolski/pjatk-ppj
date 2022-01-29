package cwiczenia.c08;
import static cwiczenia.c08.Main01.splitToDigits;

public class Zadanie02 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(1634));

    }
    public static boolean isArmstrongNumber(int n) {
        int [] arr = splitToDigits(n);
        int sum = 0;

        for (int j : arr) {
            sum += Math.pow(j, arr.length);
        }

        return n == sum;
    }
}
