package cwiczenia.c08;

public class Zadanie05 {
    public static void main(String[] args) {

        // isPalindome("test");
        System.out.println(stringToArray("test"));
        char[] arr = stringToArray("test");



    }

    // TODO: do dokończenia

    public static boolean isPalindome(char[] arr) {
        if (arr[0] != arr[arr.length - 1]) {
            return false;
        } else {
            char[] temp = new char[arr.length - 2];
            for (int i = 0; i < temp.length; i++) {

            }
            isPalindome(temp);
        }


        return true;
    }

    public static char[] stringToArray(String str) {
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }
}
