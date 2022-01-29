package cwiczenia.c06.task4;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int input;
        byte [] arr = new byte[10];
        int index = 0;

        do{
            System.out.println("Enter value to array");
            input = in.nextByte();
            arr[index] = (byte) Math.abs(input);
            index++;
            if(index == arr.length)
                index = 0;

        }while (input != 0);

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
