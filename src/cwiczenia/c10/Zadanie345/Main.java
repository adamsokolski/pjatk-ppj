package cwiczenia.c10.Zadanie345;

public class Main {
    public static void main(String[] args) {
        Tree[] trees = {
                new Tree(true, 100, "Old"),
                new ConiferTree(true, 150, "Young", 1000, 20),
                new DeciduousTree(false, 50, "Yes", 69),
                new FruitTree(false, 15, "Hell", 666, "Carrot")
        };

        for (Tree tree: trees
             ) {
            System.out.println(tree.getString());
            System.out.println();
        }
    }
}
