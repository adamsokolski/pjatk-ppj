package cwiczenia.c08;

import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        int [] arr = splitToDigits(12345);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] splitToDigits(int n) {
        int digitCounter = 0;
        int temp = n;
        do {
            temp /= 10;
            digitCounter++;
        } while (temp != 0);

        int[] result = new int[digitCounter];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = n%10;
            n /= 10;
        }

        return result;
    }


}
