package wyklady.w13;

public class Main {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(0b0000_0001);
        System.out.println(~0b0000_0001); // 111111...1110

        //===================================

        System.out.println(5 & 1);
        // 5 - 0000_0101
        // 1 - 0000_0001
        // & - 0000_0001

        //===================================

        System.out.println(5 | 2);
        // 5 - 0000_0101
        // 2 - 0000_0010
        // | - 0000_0111

        //===================================

        int wrt = 1;
        for (int i = 0; i < 32; i++) {
            System.out.println(i + "\t" + (wrt << i));
        }

        // 0000_0001 << 1
        // 0000_0010 << 2

        //=====================
        System.out.println();

        wrt = -2147483648;
        for (int i = 0; i < 32; i++) {
            System.out.println(i + "\t" + (wrt >>> i));
        }

    }

}
