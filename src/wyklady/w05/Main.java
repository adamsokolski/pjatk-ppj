package wyklady.w05;

public
    class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println(numbers);

        int[] arr = numbers;

        int[] arr2 = { 10, 20, 5};
/*
        for(int i=0; i<10; i++)
            System.out.println(arr2[i]);

 */
        for(int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);

        for(int val : arr2)
            System.out.println(val);

//=================================================================

        char[] tab = new char[20];
        for(int i=0; i<tab.length; i++) {
            tab[i] = (char) (Math.random() * 100);
            System.out.print(tab[i]);
        }
        System.out.println();

        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] >='A' && tab[i] <= 'Z') {
                System.out.print(tab[i]);
                count++;
            }
        }
        System.out.println("\nznaleziono "+count+" znakow");

        char[] tabRes = new char[count];
        count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] >='A' && tab[i] <= 'Z') {
                tabRes[count++] = tab[i];
            }
        }



        for(char ch : tabRes)
            System.out.print(ch);

    }
}
