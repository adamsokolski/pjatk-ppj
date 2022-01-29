package cwiczenia.c11.Zadanie1_2;

public class PhraseList {
    private Word word;
    private PhraseList next;

    public PhraseList(Word word) {
        this.word = word;
    }

    public void addWordAtEnd(Word word) {
        PhraseList temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new PhraseList(word);

    }

    public void show() {
        PhraseList temp = this;
        System.out.println();
        while (temp.next != null) {
            System.out.print(temp.word + " ");
            temp = temp.next;
        }
    }
}
