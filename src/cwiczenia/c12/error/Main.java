package cwiczenia.c12.error;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[5];

        System.out.println("Before Error");

        try {
            System.out.println(tab[5]);
            System.out.println("Hello");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            // System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("After Error");

    }
}
