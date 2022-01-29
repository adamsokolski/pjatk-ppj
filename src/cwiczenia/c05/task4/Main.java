package cwiczenia.c05.task4;

public class Main {
    public static void main(String[] args) {
        char mark1 = '*';
        char mark2 = ' ';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(j%2==0?mark1:mark2);
            }
            System.out.println();
            char temp = mark1;
            mark1 = mark2;
            mark2 = temp;
        }
    }
}
