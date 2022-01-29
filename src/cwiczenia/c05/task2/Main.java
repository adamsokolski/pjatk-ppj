package cwiczenia.c05.task2;

public class Main {
    public static void main(String[] args) {

        byte myByte = 15; //0-15

        if(myByte < 10){
            System.out.println(myByte);
        }else{
            int temp = myByte%10;
            System.out.println( (char)(temp + 'A') );
        }
    }
}
