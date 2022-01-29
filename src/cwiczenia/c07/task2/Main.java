package cwiczenia.c07.task2;

public class Main {
    public static void main(String[] args) {
        int [ ] [ ] tab = {
                {1 , 0 , 0 , 0 , 0} ,
                {0 , 1 , 0 , 0} ,
                {0 , 0 , 1}
                } ;

        int size = 0;
        for (int i = 0; i < tab.length; i++) {
            size += tab[i].length;
        }

        int [] resultArr = new int[size];

        for (int i = 0, resultArrIndex = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                resultArr[resultArrIndex++] = tab[i][j];
            }
        }

        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i] + ",\t");
        }
    }
}
