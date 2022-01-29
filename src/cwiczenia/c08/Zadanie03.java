package cwiczenia.c08;

public class Zadanie03 {
    public static void main(String[] args) {
        int[][] arr = calculateSquares(2, 2, 1);
        System.out.println("X\tY");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);

        }
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int widthLeft = screenWidth;
        int heightLeft = screenHeight;
        int squareCounter = (screenHeight / side) * (screenWidth / side);
        System.out.println("squareCounter = " + squareCounter);
        int tabResult[][] = new int[squareCounter][2];

        for (int x = 0, indexTabResult=0; x < screenWidth; x+=side) {
            for (int y = 0; y < screenHeight; y+=side) {
                tabResult[indexTabResult][0] = x;
                tabResult[indexTabResult++][1] = y;
            }
        }
        return tabResult;
    }
}
