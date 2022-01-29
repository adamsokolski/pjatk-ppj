package wyklady.w11;

public class Person {
    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String whoAreYou() {
        return super.toString() + "Person";
    }

    public String toString() {
        return super.toString() + "Person";
    }
}
