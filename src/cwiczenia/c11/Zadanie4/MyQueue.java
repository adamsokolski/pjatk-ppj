package cwiczenia.c11.Zadanie4;

public class MyQueue {
    private String name;
    private MyQueue next;


    public MyQueue(String name) {
        this.name = name;
    }

    public void put(String string) {
        MyQueue temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new MyQueue(string);
    }

    public void put() {

    }
}
