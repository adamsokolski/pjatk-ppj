package wyklady.w02;

public class Main {
    public static void main(String[] args) {
        // instrukcja pusta
        ;

        // instrukcja wyrażeniowa??
        System.out.println("test");

        // instrukcja grupująca
        {
            ;
            ;
            ;
        }

        // instrukcja deklaracyjna
        {
            int age;
            age = 4;
            System.out.println("age: " + age);
        }
            
        {
            final double val = 3.14;
            float exVal2 = 3.15F;

            // float musi kończyć się na 'f'
            // błędne -> float exVal3 = 3.15;
        }
        // System.out.println(val); // err

        {
            int val = 5;
            System.out.println("val: " + val);
            val = val + 5;
            System.out.println("val: " + val);
            val += 5;
            System.out.println("val: " + val);
        }
    }
}