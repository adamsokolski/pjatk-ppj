package cwiczenia.c06.task3;

public class Main {
    public static void main(String[] args) {
        int tab [ ] = { 789 , 678 , 567};

        for ( int i = 0; i < tab.length; i++)
            for ( int j = i; j < tab.length; j++)
            System . out . println ( tab [ i ] - tab [ j ] ) ;
    }
}
