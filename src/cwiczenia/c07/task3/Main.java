package cwiczenia.c07.task3;

public class Main {
    public static void main(String[] args) {
        int [] arrA = new int[(int)(Math.random() * 15)];
        int [] arrB = new int[(int)(Math.random() * 15)];
        int [] arrC = new int[(int)(Math.random() * 15)];

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = (int)(Math.random() * 15);
        }

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = (int)(Math.random() * 15);
        }

        for (int i = 0; i < arrC.length; i++) {
            arrC[i] = (int)(Math.random() * 15);
        }

        int [][] resultArr = new int[3][];
        resultArr[0] = arrA;
        resultArr[1] = arrB;
        resultArr[2] = arrC;

        //arrA[0] = 5;
        //resultArr[0][0] = 5;

        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                System.out.print(resultArr[i][j] + ",\t");
            }
            System.out.println();
        }
    }
}
