package cwiczenia.c04.zad4;

public class Main {
    public static void main(String[] args) {
        boolean doesSignificantWork = true;
        boolean makesBreakthrough = true;
        boolean nobelPrizeCandidate = false;

        if ( doesSignificantWork ) {
             if ( makesBreakthrough )
                 nobelPrizeCandidate = true ;
             else
             nobelPrizeCandidate = false ;
             }
         else if ( ! doesSignificantWork )
             nobelPrizeCandidate = false ;


         System.out.println("nobelPrizeCandidate = " + nobelPrizeCandidate);

         nobelPrizeCandidate = doesSignificantWork && makesBreakthrough;

         System.out.println("nobelPrizeCandidate = " + nobelPrizeCandidate);

    }
}
