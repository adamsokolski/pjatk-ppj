package wyklady.w15.sum.model;

import java.awt.*;

public class MyPoint {
    protected int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        throw new IllegalStateException();
    }
}
