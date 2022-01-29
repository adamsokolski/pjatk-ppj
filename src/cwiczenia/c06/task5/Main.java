package cwiczenia.c06.task5;

public class Main {
    public static void main(String[] args) {
        byte[] arr = new byte[15];
        int evenCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte)(Math.random()*6);
            System.out.print(arr[i]+", ");
            if (arr[i] % 2 == 0)
                evenCounter++;
        }
        System.out.println();

        byte[] arrEven = new byte[evenCounter];
        int arrEvenIndex = 0;
        byte[] arrOdd = new byte[arr.length - evenCounter];
        int arrOddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arrEven[arrEvenIndex++] = arr[i];
            else
                arrOdd[arrOddIndex++] = arr[i];
        }

        System.out.println("EVEN");
        for (int i = 0; i < arrEven.length; i++) {
            System.out.print(arrEven[i]+", ");
        }

        System.out.println("\nODD");
        for (int i = 0; i <  arrOdd.length; i++) {
            System.out.print( arrOdd[i]+", ");
        }



    }
}
