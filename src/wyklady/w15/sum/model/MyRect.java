package wyklady.w15.sum.model;

import java.awt.*;

public class MyRect extends MyPoint {

    protected int side;

    public MyRect(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(x, y, side, side);
    }
}
