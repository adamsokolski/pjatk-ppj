package wyklady.w08;

public
    class Main {

    public static void showArray(String source, int[] arr){
        System.out.print(source+" [");
        for(int valT : arr)
            System.out.print(" " + valT);
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};
        passByRef(arr);

        /*
        System.out.print("main: [");
        for(int valT : arr)
            System.out.print(" " + valT);
        System.out.println("]");
        */
        showArray("main:", arr);

        // ==============================

        int res = addSimple(5, 10);
        System.out.println(res);

        //===============================================

        funcOverload('c');
        float fVal = 3.14f;
        funcOverload(fVal);

        //================================

        rec(9);

        // =============================

        System.out.println();
        System.out.println(
            "sumRec result: "+sumRec(9)
        );

        // ==============================

        char[] tab = {'k', 'b', 'j', 'b', 'k'};

        System.out.println(
            "isPalindrom res: "+isPalindrom( tab, 0)
        );
    }

    public static boolean isPalindrom(char[] arr, int step){
        if(step >= arr.length-1-step)
            return true;
        if(arr[step] == arr[arr.length-1-step])
            return isPalindrom(arr, step+1);
        else
            return false;
    }

    public static int sumRec(int val){
        if(val !=0)
            return val + sumRec(val - 1);
        return val;
    }

    public static void rec(int val){
        System.out.print(val);
        if(val != 0)
            rec(val-1);
        System.out.print(val);
    }

    //98765432100123456789

    public static void passByRef(int[] fArr){
        showArray("passByRef:", fArr);
        fArr[1] = 99;
        showArray("passByRef:", fArr);
    }

    public static void fun(){
        ;
        if(true)
            return;

        ;
        //return;
    }

    public static int addSimple(int val1, int val2){
        return val1 + val2;
    }

    public static void funcOverload(){
        System.out.println("funcOverload: void");
    }

    public static void funcOverload(int val){
        System.out.println("funcOverload: int");
    }

    public static void funcOverload(char val){
        System.out.println("funcOverload: char");
        funcOverload( val + 0.0);
    }

    public static void funcOverload(double val){
        System.out.println("funcOverload: double");
    }


}
