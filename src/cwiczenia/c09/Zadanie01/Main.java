package cwiczenia.c09.Zadanie01;

public class Main {
    public static void main(String[] args) {

        Person person;
        person = new Person();

       /* System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.birthYear);*/

        person.name = "Adam";
        person.surname = "Sokólski";
        person.birthYear = 2001;

       /*System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.birthYear);*/

        Person personNeo = new Person();
        personNeo.name = "Bob";

        System.out.println(person.kind);
        person.kind = "Reptilian";

        System.out.println(personNeo.kind);
        System.out.println(person.kind);


        System.out.println(personNeo.name);
        System.out.println(person.name);

    }
}
