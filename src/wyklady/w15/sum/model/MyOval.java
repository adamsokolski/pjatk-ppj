package wyklady.w15.sum.model;

import java.awt.*;

public class MyOval extends MyPoint{

    protected int width, height;

    public MyOval(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(x, y, width, height);
    }
}
