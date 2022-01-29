package cwiczenia.c07.task8;

public class Main {
    public static void main(String[] args) {

        System.out.println(findMax(10,15,5));
    }

    public static int findMax(int a, int b, int c){
        if(a > b && a > c)
            return a;
        if(b > c)
            return b;
        return c;
    }
}
