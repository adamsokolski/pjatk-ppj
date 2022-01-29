package cwiczenia.c04.zad10;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        System.out.print("FOR: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(n+i+ " ");
        }

        System.out.print("\nWHILE: ");
        while (n<11){
            System.out.print(n+ " ");
            n++;
        }

        System.out.print("\nDO WHILE: ");
        n = 1;
        do{
            System.out.print(n+ " ");
            n++;
        }while (n<11);
    }
}
