package cwiczenia.c07.swingTask1;

import javax.swing.*;
import java.awt.*;

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

        //GUI
        //SwingUtilities.invokeLater(MyWindow::new);
        PointBag pointBag = new PointBag(arrPoints,minX,maxX,minY,maxY);
        SwingUtilities.invokeLater(() -> new MyWindow(pointBag));
    }
}

class PointBag {
    private int[][] arrPoints;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    private int wysokosc;
    private int szerokosc;
    private int centerX;
    private int centerY;

    public PointBag(int[][] arrPoints, int minX, int maxX, int minY, int maxY) {
        this.arrPoints = arrPoints;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;

        this.wysokosc = maxY - minY;
        this.szerokosc = maxX - minX;
        this.centerX = minX + szerokosc /2;
        this.centerY = minY + wysokosc/2;
    }

    public int[][] getArrPoints() {
        return arrPoints;
    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }
}

class MyWindow extends JFrame {

    private PointBag pointBag;

    public MyWindow(PointBag pointBag) {
        super();
        this.pointBag = pointBag;
        setSize(1024, 768);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        initComponents();

        setVisible(true);
    }

    private void initComponents() {
        this.add(new MyPanel(pointBag));

    }
}

class MyPanel extends JPanel{

    private PointBag pointBag;

    final int SINGLE_LINE_SIZE = 20;
    final int POINT_RADIUS_SIZE = SINGLE_LINE_SIZE/4;

    public MyPanel(PointBag pointBag) {
        super();
        this.pointBag = pointBag;
    }

    @Override
    public void paint(Graphics g) {
        int centerX = this.getWidth()/2;
        int centerY = this.getHeight()/2;

        super.paint(g);
        // Y axis
        g.drawLine( this.getWidth()/2,0,  this.getWidth()/2, this.getHeight());
        // Y axis scale
        for (int i = 0; i < this.getHeight(); i+= SINGLE_LINE_SIZE) {
            g.drawLine(centerX- SINGLE_LINE_SIZE /2,centerY-i,
                    centerX+ SINGLE_LINE_SIZE /2, centerY-i);
        }
        for (int i = 0; i < this.getHeight(); i+= SINGLE_LINE_SIZE) {
            g.drawLine(centerX- SINGLE_LINE_SIZE /2,centerY+i,
                    centerX+ SINGLE_LINE_SIZE /2, centerY+i);
        }
        // X axis
        g.drawLine( 0,this.getHeight()/2,  this.getWidth(), this.getHeight()/2);
        // X axis scale
        for (int i = 0; i < this.getHeight(); i+= SINGLE_LINE_SIZE) {
            g.drawLine(centerX+i,centerY- SINGLE_LINE_SIZE /2,
                    centerX+i, centerY+ SINGLE_LINE_SIZE /2);
        }
        for (int i = 0; i < this.getHeight(); i+= SINGLE_LINE_SIZE) {
            g.drawLine(centerX-i,centerY- SINGLE_LINE_SIZE /2,
                    centerX-i, centerY+ SINGLE_LINE_SIZE /2);
        }

        //Draw Points
        for (int i = 0; i < this.pointBag.getArrPoints()[0].length; i++) {
            drawPoint(g,this.pointBag.getArrPoints()[0][i],this.pointBag.getArrPoints()[1][i]);
        }

        //Draw Rect
        g.drawRect(centerX+this.pointBag.getMinX()*SINGLE_LINE_SIZE,
                centerY-this.pointBag.getMaxY()*SINGLE_LINE_SIZE,
                ((this.pointBag.getMaxX() - this.pointBag.getMinX())*SINGLE_LINE_SIZE),
                ((this.pointBag.getMaxY() - this.pointBag.getMinY())*SINGLE_LINE_SIZE));

        //Draw center point rectangle;
        g.setColor(new Color(255, 0, 0, 255));
        //this.drawPoint(g,);
        this.drawPoint(g,this.pointBag.getCenterX(),this.pointBag.getCenterY());
    }
    public void drawPoint(Graphics g, int x, int y) {
        /*System.out.print("x = " + x);
        System.out.println(" y = " + y);*/
        g.fillOval(this.getWidth()/2+(x * SINGLE_LINE_SIZE) - POINT_RADIUS_SIZE/2
                ,this.getHeight()/2-(y * SINGLE_LINE_SIZE) - POINT_RADIUS_SIZE/2,POINT_RADIUS_SIZE,POINT_RADIUS_SIZE);
    }
}
