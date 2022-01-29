package cwiczenia.c11.Zadanie3;

public class MyStack {
    private int size;
    private int maxSize;
    private Student[] arr;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new Student[size];
    }

    public void push(Student student) {
        arr[size++] = student;
    }

    public Student pop() {
        Student student = this.arr[this.size];
        this.arr[size--] = null;
        return student;
    }
}
