package cwiczenia.c07.task1;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_POINTS = 15;
        int[] arrX = new int[NUMBER_OF_POINTS];
        int[] arrY = new int[NUMBER_OF_POINTS];

        int [][] arrPoints = new int[2][];
        arrPoints[0] = arrX;
        arrPoints[1] = arrY;

        final int MIN = -15;
        final int MAX = 15;

        for (int i = 0; i < arrPoints.length; i++) {
            for (int j = 0; j < arrPoints[i].length; j++) {
                arrPoints[i][j] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            }
        }

        int minX = arrX[0];
        int maxX = arrX[0];
        int minY = arrY[0];
        int maxY = arrY[0];

        for (int i = 1; i < arrX.length; i++) {
            if(maxX<arrX[i])
                maxX = arrX[i];
            if(minX>arrX[i])
                minX = arrX[i];
        }

        for (int i = 1; i < arrY.length; i++) {
            if(maxY<arrY[i])
                maxY = arrY[i];
            if(minY>arrY[i])
                minY = arrY[i];
        }

        System.out.println("minX = " + minX);
        System.out.println("maxX = " + maxX);
        System.out.println("minY = " + minY);
        System.out.println("maxY = " + maxY);

        int wysokosc = maxY - minY;
        System.out.println("wysokość: " + wysokosc);
        int szerokosc = maxX - minX;
        System.out.println("szerokość: " + szerokosc);
        double centerX = minX + szerokosc /2;
        double centerY = minY + wysokosc/2;
        System.out.println("center x = " + centerX + "  center y = " + centerY );


    }
}
