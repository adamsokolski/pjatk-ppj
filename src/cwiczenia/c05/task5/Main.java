package cwiczenia.c05.task5;

public class Main {
    public static void main(String[] args) {
        double [] tab = new double [10];

        //ad1
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random() * 10);
        }

        //ad2
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ",\t");
        }

        System.out.println("\n");
        //ad3
        for (int i = 0; i < tab.length; i+=2) {
            System.out.print(tab[i] + ",\t");
        }

        System.out.println("\n");
        //ad4
        for (int i = 0; i < tab.length; i++) {
            if((int)tab[i] %2 != 0)
                System.out.print(tab[i] + ",\t");
        }
    }
}
