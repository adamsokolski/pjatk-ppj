package cwiczenia.c10.inheritanceStart.example;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);

        Cuboid cuboid1 = new Cuboid(1, 2, 3);
        Cuboid cuboid2 = new Cuboid(rectangle, 3);

        System.out.println(rectangle);
        System.out.println(cuboid1);
        System.out.println(cuboid2);



    }
}
