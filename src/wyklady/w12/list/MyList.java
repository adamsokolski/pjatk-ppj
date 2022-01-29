package wyklady.w12.list;

public class MyList {

    Node head;

    public void add(Object str) {
        if (head == null)
            head = new Node(str);
        else {
            Node tmp = new Node(str);
            tmp.setNext(head);
            head = tmp;
        }
    }

    public void show() {
        Node tmp = head;
        while (tmp !=null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }
}
