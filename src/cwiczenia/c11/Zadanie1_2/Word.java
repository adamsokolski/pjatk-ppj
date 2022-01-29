package cwiczenia.c11.Zadanie1_2;

public class Word {
    private char[] arr;
    private int number;

    public Word() {
        this.arr = new char[100];
        this.number = 0;
    }

    public void addChar(char char1) {
        this.arr[this.number++] = char1;
    }

    public void show() {
        for (int i = 0; i < number; i++) {
            System.out.print(this.arr[i]);
        }
    }

    public String getString() {
        String returnString = "";
        for (int i = 0; i < number; i++) {
            returnString += this.arr[i];
        }
        return returnString;
    }

    public int length() {
        return number;
    }
}
