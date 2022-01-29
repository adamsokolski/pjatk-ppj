package wyklady.w15.sum.model;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {

    private MyList list;
    private Frame frame;

    public MyMouseAdapter(MyList list, Frame frame) {
        this.list = list;
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        int width = (int)(Math.random()*100);
        int height = (int)(Math.random()*100);
        System.out.println("x: " + e.getX() + ", y: " + e.getY() + ", width: " + width + ", height: " + height);
        list.add(new MyOval(
                e.getX(),
                e.getY(),
                width,
                height
                )
        );
        frame.repaint();
    }
}

