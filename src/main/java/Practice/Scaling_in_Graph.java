package Practice;

import java.awt.*;
import javax.swing.JFrame;

public class Scaling_in_Graph extends Canvas {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        setForeground(Color.black);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        int xc = getWidth() / 2, yc = getHeight() / 2;
        int[] x = {10, 100, 55};
        int[] y = {10, 10, 100};
        int[] a= new int[3];
        int[] b= new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = xc + x[i];
            b[i] = yc - y[i];
        }
        g.drawPolygon(a, b, 3);
        double sx=0.5;
        double sy = 0.5;
         for (int i = 0; i < 3; i++) {
           x[i] =  (int) (xc+(x[i]*sx));
            y[i] = (int) (yc-(y[i]*sy));
            
        }
      g.setColor(Color.blue);
      g.drawPolygon(x, y, 3);
        

    }

    public static void main(String[] args) {
        Scaling_in_Graph m = new Scaling_in_Graph();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("2D Scaling");
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
