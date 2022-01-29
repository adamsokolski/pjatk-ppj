package cwiczenia.c08;

import java.util.Arrays;
import static cwiczenia.c08.Main01.splitToDigits;

public class Test1 {
    public static void main(String[] args) {
        int [] arr = splitToDigits(123456);
        System.out.println(Arrays.toString(arr));
    }
}
