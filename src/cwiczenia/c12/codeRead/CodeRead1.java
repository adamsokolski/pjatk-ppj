package cwiczenia.c12.codeRead;

public class CodeRead1 {
    public static void main(String[] args) {

        System.out.print("\n\tPART1\n");


        int [] tab = {1,2,3,4,5};

        for (int i =  0; i < tab.length; i+=2) {
            tab[i] *= i;
            System.out.print(tab[i] + "; ");
        }

        System.out.print("\n\tPART2\n");


        System.out.print(pow(2,3));

        System.out.print("\n\tPART3\n");

        int var = 50;

        do{
            switch (var){
                case 50:
                    System.out.print(1 + "; ");
                    var =- 500;
                case 100 :
                    System.out.print(2 + "; ");
                case 2 :
                    System.out.print(3 + "; ");
                default:
                    System.out.println('D');
                    var += 400;
            }
        }while(var < -5);

        System.out.print("\tPART4\n");

        {
            int a, b;
            {
                double myDouble = 5.5;
                a = (int) myDouble;
                {
                    int myInt = 10;
                }
                int myInt = 55;
                b = myInt;
            }
            double myDouble = 1.5;

            System.out.println(a + b);
        }


        System.out.print("\tPART5\n");

        {
            int a = 5, b = 5;

            a++;
            b = b++;
            System.out.println("b = " + b);
            System.out.println("a = " + a);
        }

        {
            System.out.print("\tPART5 ATTACK\n");

            int happy = 5;
            int sad = 12;

            happy += happy++ + ++sad - --happy + sad++;

            System.out.print(happy + "; ");
            System.out.print(sad + "; ");
        }


        System.out.print("\n\tPART6\n");

        System.out.println(fun(5));
        System.out.println(fun(2.5f,5.0f));
        System.out.println((char)fun('A'));
        System.out.println((char)fun('0',5));
        System.out.println((char)fun('0','A'));

        System.out.print("\tPART7\n");

        int size = 1;

        for (int i = 0; i < 2*size+1; i++) {
            for (int j = 0; j < 2*size+1; j++) {
                if((j >=i && j<= 2*size-i) || (j >= 2*size-i && j<=i)){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        System.out.print("\tPART8\n");

        double[][] arr = {
                {3, 2, 1, 1, 1, 1},
                {6, 5, 4, 5, 6},
                {9, 8, 7}};

        System.out.println(arr.length);
        System.out.println(arr[1].length);
        System.out.println(arr[2][2]);
        System.out.println(arr[2]);

    }

    public static int pow (int a, int power){
        if(power == 0){
            return 1;
        }else{
            int result = a * pow(a, power-1);
            System.out.println("power = " + power);
            return result;
        }
    }

    public static int fun(int a){
        return a++;
    }

    public static double fun(float a, float b){
        return a*(int)1.5+b;
    }

    public static char fun (char a, char b){
        if(a == 0){
            return 'A';
        }else{
            return 'B';
        }
    }

}
// by Michal Skrzekut