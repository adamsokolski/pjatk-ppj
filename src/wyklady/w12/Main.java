package wyklady.w12;
import wyklady.w12.list.MyList;

public class Main {
    public static void main(String[] args) {

        MyList list = new MyList();

        list.add(new Person("Jan"));
        list.add(new Person("Ola"));
        list.add(new Person("Kazik"));

        list.show();

    }
}


class Person {
    private String name;

    public Person (String name) {
        this.name = name;
    }

    public String toString() {
        return super.toString()+" -> Person("+name+")";
    }
}
