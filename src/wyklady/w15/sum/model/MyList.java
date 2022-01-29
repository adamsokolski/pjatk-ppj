package wyklady.w15.sum.model;

public class MyList {
    private Node head;

    public MyList() {
        this.head = null;
    }

    public void add(MyPoint point) {
        Node temp = new Node(point);
        temp.setNext(this.head);
        this.head = temp;
    }

    public Node getHead() {
        return this.head;
    }

}
