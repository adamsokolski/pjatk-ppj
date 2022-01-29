package wyklady.w10;

public class MyList {
    private ListElement head;

    public MyList() {
        this.head = null;
    }

    public void addMonth(Month month) {

            ListElement temp = new ListElement();
            temp.month = month;
            temp.next = head;
            head = temp;
    }

    public void addLastElement(Month month) {
        if (this.head == null) {
            this.head = new ListElement();
            this.head.month = month;
        } else {
            ListElement tmp = this.head;
            while (tmp.next != null)
                tmp = tmp.next;

            tmp.next = new ListElement();
            tmp.next.month = month;
        }
    }

    public void show() {
        System.out.println("=================");

        ListElement tmp = this.head;
        while(tmp != null) {
            System.out.println(tmp.month.getData());
            tmp = tmp.next;
        }
    }


}
