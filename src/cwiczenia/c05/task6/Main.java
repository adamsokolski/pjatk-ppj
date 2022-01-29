package cwiczenia.c05.task6;

public class Main {
    public static void main(String[] args) {
        char [] tab = {'B', 'A', 'C'};
        int minIndex = 0;
        for (int i = 1; i < tab.length; i++) {
            if(tab[minIndex] > tab[i])
                minIndex = i;
        }
        System.out.println("minValue= " + tab[minIndex] + " at " + minIndex);
    }
}
