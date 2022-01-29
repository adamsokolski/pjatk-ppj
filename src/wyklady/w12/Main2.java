package wyklady.w12;

public class Main2 {
    public static void main(String[] args) {
        int[] tab = new int[5];


        try {
            System.out.println(tab[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("element poza tablicy");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            // Inne
        }

        System.out.println("Koniec programu");




    }
}
