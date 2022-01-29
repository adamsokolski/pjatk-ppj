package wyklady.w14.strings;

public class Main {
    public static void main(String[] args) {
        // Strings
        System.out.println("a" + "b");

        String str = "Ala ma kota";

        for (int i = 0; i < str.length(); i++)
            System.out.print(str.charAt(i) + " ");
        System.out.println();

        // Where is first space
        System.out.println(
                str.indexOf(' ')
        );

        System.out.println(
                str.substring(0, str.indexOf(' '))
        );

        System.out.println(
                str.indexOf(' ', 4)
        );

        System.out.println(
                str.substring(str.indexOf(' ') + 1, str.indexOf(' ', 4))
        );
        System.out.println();

        //==========================

        /*
        for (int i = 10; i <= 1000000; i *= 10) {
            String ex1 = new String();
            long startTime = System.currentTimeMillis();

            for (int j = 0; j < i; j++)
                ex1 = ex1 + 'a';

            long endTime = System.currentTimeMillis();
            System.out.println(i+"\t" + (endTime-startTime) + "ms");
        }
        */

        // StringBuilder
        for (int i = 10; i <= 1000000; i *= 10) {
            StringBuilder ex1 = new StringBuilder();
            long startTime = System.currentTimeMillis();

            for (int j = 0; j < i; j++)
                ex1.append('a');

            long endTime = System.currentTimeMillis();
            System.out.println("Builder: " + i + "\t" + (endTime - startTime) + "ms");
        }
        System.out.println();


        // StringBuffer
        for (int i = 10; i <= 1000000; i *= 10) {
            StringBuffer ex1 = new StringBuffer();
            long startTime = System.currentTimeMillis();

            for (int j = 0; j < i; j++)
                ex1.append('a');

            long endTime = System.currentTimeMillis();
            System.out.println("Buffer: " + i + "\t" + (endTime - startTime) + "ms");
        }




    }
}