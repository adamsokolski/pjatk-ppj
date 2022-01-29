package wyklady.w07;

public
    class Main {

    public static void main(String[] args) {
        fun();
        func( 5 + 10);
        int val = 100;
        func(val);

        int val2 = 10;
        passByValue(val2);
        System.out.println("main: "+val2);

        //=====================

        int[] arr = { 10, 20, 30, 40, 50};
        passByRef(arr);
        System.out.print("main: [");
        for(int valT : arr)
            System.out.print(" " + valT);
        System.out.println("]");
    }

    public static void passByRef(int[] fArr){
        System.out.print("passByRef: [");
        for(int val : fArr)
            System.out.print(" " + val);
        System.out.println("]");

        fArr[1] = 99;

        System.out.print("passByRef: [");
        for(int val : fArr)
            System.out.print(" " + val);
        System.out.println("]");
    }

    public static void validateInt(int val){
        if(val == 0)
            System.out.println("...");
        else
            System.out.println("....");
    }

    public static void passByValue(int val){
        System.out.println("passByValue: "+val);
        val = 20;
        System.out.println("passByValue: "+val);
    }

    private static void fun(){
        System.out.println("fun: "+"hello");
        func(50);
    }

    public static void func(int a){
        System.out.println("func: "+a);
    }
}
