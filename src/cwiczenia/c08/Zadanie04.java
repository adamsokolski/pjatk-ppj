package cwiczenia.c08;
import java.time.LocalDate;
public class Zadanie04 {
    public static void main(String[] args) {
        printMonth(10, 2021);
    }

    public static void printMonth(int m, int y) {
        LocalDate localDate = LocalDate.of(y,m,1);
        int monthLength = localDate.lengthOfMonth();
        int dayOfWeek = localDate.getDayOfWeek().getValue();

        System.out.println("Mon\tTue\tWed\tThr\tFri\tSat\tSun");
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= monthLength;) {
            while (dayOfWeek <= 7 && i < monthLength + 1) {
                System.out.print(i+"\t");
                dayOfWeek++;
                i++;
            }
            System.out.println();
            dayOfWeek = 1;
        }
    }
}
