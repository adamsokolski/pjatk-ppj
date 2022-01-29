package wyklady.w06;

import java.util.Scanner;

public
    class Main {

    public static void main(String[] args) {
        int[][] tab2d = new int[3][5];

        for(int i=0; i< tab2d.length; i++){
            System.out.println(tab2d[i]);
            for(int j = 0; j < tab2d[i].length; j++)
                System.out.print(tab2d[i][j]+" ");
            System.out.println();
        }

        for(int i=0; i< tab2d.length; i++)
            for(int j = 0; j < tab2d[i].length; j++)
                tab2d[i][j] = (int)(Math.random()*20);

        for(int i=0; i< tab2d.length; i++){
            System.out.println(tab2d[i]);
            for(int j = 0; j < tab2d[i].length; j++)
                System.out.print(tab2d[i][j]+" ");
            System.out.println();
        }
    }

    public static void ex01(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] tab = new int[5];

        int tmp;
        while( (tmp = scan.nextInt()) != 0 && count < tab.length){
            tab[count++] = tmp;
        }

        for(int val : tab)
            System.out.print(val+", ");
        System.out.println();

        while( (tmp = scan.nextInt()) != 0 && count < tab.length){
            tab[count++] = tmp;
        }

        for(int val : tab)
            System.out.print(val+", ");
        System.out.println();
        {
            tab = new int[5];
/*
        for(int i = 0; i < tab.length; i++){
            tab[i] = scan.nextInt();
        }
*/
            int i = 0;
            for (int tmp1 = scan.nextInt(); i < tab.length && tmp1 != 0; ) {
                tab[i++] = tmp1;
            }
        }
    }

    public static void ex02(){
            Scanner scan = new Scanner(System.in);

            int[] tab = { 10, 20, 30, 40, 50};
            int count = 5;

            for(int i = 0; i < count; i++)
                System.out.print(tab[i]+", ");
            System.out.println();

            int indexToDelete = scan.nextInt();
            if( indexToDelete < 0 || indexToDelete >= tab.length)
                System.out.println("Error");
            else{

                for(int i = indexToDelete; i < tab.length-1; i++){
                    tab[i] = tab[i+1];
                }
                count--;

                for(int i = 0; i < count; i++)
                    System.out.print(tab[i]+", ");
                System.out.println();

                int tmp;
                while( (tmp = scan.nextInt()) != 0 && count < tab.length){
                    tab[count++] = tmp;
                }

                for(int i = 0; i < count; i++)
                    System.out.print(tab[i]+", ");
                System.out.println();
            }
        }

    public static void ex03(){
        int count = 2;
        int[] tab = {10, 30, 0};

        int toAdd = 20;
        int addIndex = 1;

        if(addIndex < count){
            for(int i=addIndex; i < count; i++){
                tab[i+1] =tab[i];
            }
            tab[addIndex] = toAdd;
        }else{

        }

        for(int val : tab)
            System.out.print(val+", ");
        System.out.println();

    }

    public static void ex04(){
        int[] tab = new int[15];
        for(int i=0; i<tab.length; i++)
            tab[i] = (int)(Math.random()*20);

        for(int val : tab)
            System.out.print(val+", ");
        System.out.println();

        for(int j=0; j< tab.length-1; j++) {
            int min = j;
            for (int i = j+1; i < tab.length; i++) {
                if (tab[i] < tab[min])
                    min = i;
            }
            System.out.println("znalazlem min na indeksie: " + min + " jest to " + tab[min]);

            int tmp = tab[min];
            tab[min] = tab[j];
            tab[j] = tmp;

            System.out.println("tab po zamianie:");
            for (int val : tab)
                System.out.print(val + ", ");
            System.out.println();
        }
    }

    public static void ex05(){
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] tab = new int[5];

        int tmp;
        while( (tmp = scan.nextInt()) != 0 ){
            if(count >= tab.length){
                System.out.println("brak miejsca");

                int[] tmpTab = new int[tab.length*2];
                for(int i=0; i<tab.length; i++)
                    tmpTab[i] = tab[i];
                tab = tmpTab;
            }
            tab[count++] = tmp;

            for(int val : tab)
                System.out.print(val+", ");
            System.out.println();
        }
    }
}
