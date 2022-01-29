package cwiczenia.c12.ex2;

public class ClassA {
    public static void fun() throws MyException {
        System.out.println("in fun");
        throw new MyException();
    }

    public static void ffun() {
        try {
            fun();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
