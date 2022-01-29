package wyklady.w15.sum.model;

public class Node {
    private Node next;
    private MyPoint data;

    public Node(MyPoint data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public MyPoint getData() {
        return data;
    }

    public void setData(MyPoint data) {
        this.data = data;
    }
}
