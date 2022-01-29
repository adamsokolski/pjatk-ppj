package cwiczenia.c04.zad9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj rok:");
        java.util.Scanner in = new java.util.Scanner(System.in) ;
        int year = in.nextInt () ;
        boolean isLeapYear;
        isLeapYear = year%4==0 && year%100!=0;
        isLeapYear = isLeapYear || (year%400==0);
        System.out.println(year + " isLeapYear = " + isLeapYear);
    }
}
