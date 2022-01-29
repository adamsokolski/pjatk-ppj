package cwiczenia.c09.Zadanie02;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple");
        System.out.println(apple.name);
        System.out.println(apple.weigth);

        Fruit.show(apple);
        apple.show();

        Fruit orange = new Fruit();

    }
}
