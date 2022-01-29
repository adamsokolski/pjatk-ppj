package cwiczenia.c05.task3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("n\tn^2\tn^3\tn^4");
        for (int i = 1; i <=n; i++) {
            System.out.print(i + "\t");
            for (int j = 2; j <= 4; j++) {
                //System.out.print((int) Math.pow(i,j) + "\t");
                int temp = i;
                for (int k = 1; k < j; k++) {
                    temp*=i;
                }
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}
