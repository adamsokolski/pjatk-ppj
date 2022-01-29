package wyklady.w11;

public class Main {
    public static void main(String[] args) {

        // Obiekt został stworzony nawet bez zdeklarowanego konstruktora,
        // ponieważ jest tworzony konstruktor domyślny
        A a = new A();
        // System.out.println(a);

        Person person = new Person("Ala", 1986);
        Student student = new Student("Kazik", 1945, 5);

        System.out.println(person.whoAreYou());
        System.out.println(student.whoAreYou());

        System.out.println(person);
        System.out.println(student);

    }
}

class A {}
