package cwiczenia.c04.zad2;

public class Main {
    public static void main(String[] args) {
        {
            double a = 5;
            double x = -1;
            if (a >= 0) x = 1.701;
            if (a < 0) x = 2D * 3.14f;
            System.out.println(x);
        }

        {
            double a = 5;
            double x ;
            if (a >= 0)
                x = 1.701;
            else
                x = 2D * 3.14f;
            System.out.println(x);
        }

    }
}
