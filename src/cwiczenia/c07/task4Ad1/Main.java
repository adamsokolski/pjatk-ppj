package cwiczenia.c07.task4Ad1;

public class Main {
    public static void main(String[] args) {
        float [][] arr = new float[3][3];

        for (int i = 0, counter=0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
                System.out.print(arr[i][j]+",\t");
            }
            System.out.println();
        }

        float sum = 0;
        for (int i = 0, reversI = arr.length-1; i < arr.length; i++, reversI--) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j || reversI == j)
                    sum += arr[i][j];
            }
        }

        System.out.println("sum = " + sum);
    }
}
