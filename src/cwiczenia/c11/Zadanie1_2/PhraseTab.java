package cwiczenia.c11.Zadanie1_2;

public class PhraseTab {
    private Word[] phrase;
    private int length;

    public PhraseTab() {
        this.phrase = new Word[100];
        this.length = 0;
    }

    public void addWordAtEnd(Word word) {
        this.phrase[length++] = word;
    }

    public void show() {
        for (int i = 0; i < length; i++) {
            System.out.print(phrase[length] + " ");
        }
    }
}
