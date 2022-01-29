package cwiczenia.c07.task5;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {9,8,7,6,5,4,3};
        int[] c = new int[a.length+b.length];

        for (int i = 0, indexA = 0, indexB = b.length-1; i < c.length; i++) {
            if(indexA<a.length && indexB>0) {
                if (a[indexA] < b[indexB])
                    c[i] = a[indexA++];
                else
                    c[i] = b[indexB--];
            }else if(indexA<a.length)
                c[i] = a[indexA++];
            else
                c[i] = b[indexB--];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+",\t");
        }
    }
}
