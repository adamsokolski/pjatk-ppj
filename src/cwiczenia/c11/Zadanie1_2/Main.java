package cwiczenia.c11.Zadanie1_2;

public class Main {
    public static void main(String[] args) {

        Word word1 = new Word();

        word1.addChar('a');
        word1.addChar('d');
        word1.addChar('a');
        word1.addChar('m');

        word1.show();

        System.out.println();
        System.out.println("Length: " + word1.length());

    }
}
