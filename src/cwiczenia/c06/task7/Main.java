package cwiczenia.c06.task7;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,1,2,3,4};

        boolean allDouble = true;
        for (int i = 0; i < tab.length && allDouble; i++) {
            boolean notSigleDouble = true;
            for (int j = 0; j < i && notSigleDouble; j++) {
                if(tab[i] == tab[j])
                    notSigleDouble = false;
            }
            for (int j = i+1; j < tab.length && allDouble; j++) {
                if(tab[i] == tab[j])
                    notSigleDouble = false;
            }
            if(notSigleDouble)
                allDouble = false;
        }

        System.out.println("allDouble = " + allDouble);
    }
}
