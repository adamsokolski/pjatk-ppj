package cwiczenia.c07.task4Ad2;

public class Main {
    public static void main(String[] args) {
        float [][] arr = new float[3][3];

        for (int i = 0, counter=0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
            }
        }

        arr[2][0] = -4;
        arr[arr.length-1][arr[arr.length-1].length-1] = -4;

        for (int i = 0, counter=0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+",\t");
            }
            System.out.println();
        }

        float mainDiagonalSum = 0;
        float secondDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
                mainDiagonalSum += arr[i][i];
                secondDiagonalSum += arr[i][arr.length-1-i];
        }

        System.out.println("mainDiagonalSum = " + mainDiagonalSum);
        System.out.println("secondDiagonalSum = " + secondDiagonalSum);
    }
}
