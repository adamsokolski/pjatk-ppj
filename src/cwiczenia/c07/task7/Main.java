package cwiczenia.c07.task7;

public class Main {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println("wrt = " + wrt);
        modifyValue(wrt);
        System.out.println("wrt = " + wrt);
    }

    public static void modifyValue (int x){
        System.out.println("x = " + x);
        x *= 5;
        System.out.println("x = " + x);
    }
}
