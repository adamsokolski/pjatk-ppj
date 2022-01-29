package cwiczenia.c06.task6;

public class Main {
    public static void main(String[] args) {
        int [] arr = { 153 , 333 , 370 , 515 , 407 , 80};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int powCounter = 0;
            while (temp!=0){
                temp/=10;
                powCounter++;
            }
            temp = arr[i];
            int sum = 0;
            while (temp!=0){
                sum += Math.pow(temp%10,powCounter);
                temp/=10;
            }

            System.out.println( arr[i] + " " + (sum==arr[i]?" jest ": " nie jest ") +  "narcystyczna");

        }
    }
}
