package cwiczenia.c11.Zadanie3;

public class Student {
    private int sNumber;
    private String name;

    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show() {
        System.out.println(this.name + " - s" + this.sNumber);
    }
}
