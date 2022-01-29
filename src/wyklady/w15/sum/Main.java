package wyklady.w15.sum;

import wyklady.w15.sum.model.*;

import java.awt.*;

public class Main extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    // private MyPoint points[];
    private MyList list;


    public Main() {
        /*
        this.points = new MyPoint[]{
            new MyOval(50,50,200,200),
            new MyRect(250,250,300)
        }; */

        list = new MyList();
        list.add(new MyOval(50,50,200,200));
        list.add(new MyRect(250,250,300));

        this.addWindowListener(
            new MyWindowAdapter()
        );

        this.addMouseListener(
                new MyMouseAdapter(list, this)
        );

        this.setSize(640,480);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

       /*
        super.paint(g);
        g.setColor(Color.green);
        points[0].draw(g);
        g.setColor(Color.RED);
        points[1].draw(g);
       */


        /*
        for(MyPoint shape : points) {
            g.setColor(
                    new Color(
                            (int)(Math.random()*255),
                            (int)(Math.random()*255),
                            (int)(Math.random()*255)
                            )
            );
            shape.draw(g);
        }
        */

        Node tmp = list.getHead();
        while (tmp!= null) {
            g.setColor(
                    new Color(
                            (int)(Math.random()*255),
                            (int)(Math.random()*255),
                            (int)(Math.random()*255)
                    )
            );
            tmp.getData().draw(g);
            tmp = tmp.getNext();
        }
    }

}
