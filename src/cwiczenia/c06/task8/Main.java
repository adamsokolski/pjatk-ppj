package cwiczenia.c06.task8;

public class Main {
    public static void main(String[] args) {

        /*byte[][] tab = new byte[5][5];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = (byte) (Math.random()*126);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }*/

        byte[][] tab = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,9,6,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},};

        boolean verticalSymmetry = true;
        for (int i = 0; i < tab.length && verticalSymmetry; i++) {
            for (int j = 0; j < tab[0].length/2 && verticalSymmetry; j++) {
                if(tab[i][j] != tab[i][tab[i].length-1-j])
                    verticalSymmetry = false;
            }
        }

        boolean horizontalSymmetry = true;
        for (int i = 0; i < tab.length/2 && horizontalSymmetry; i++) {
            for (int j = 0; j < tab[0].length && horizontalSymmetry; j++) {
                if(tab[i][j] != tab[tab.length-1-i][j])
                    horizontalSymmetry = false;
            }
        }

        boolean diagonalSymmetry = true;
        for (int i = 0; i < tab.length && diagonalSymmetry; i++) {
            for (int j = 0; j < tab[0].length && diagonalSymmetry; j++) {
                if(tab[i][j] != tab[j][i])
                    diagonalSymmetry = false;
            }
        }

        System.out.println("verticalSymmetry = " + verticalSymmetry);
        System.out.println("horizontalSymmetry = " + horizontalSymmetry);
        System.out.println("diagonalSymmetry = " + diagonalSymmetry);




    }
}
