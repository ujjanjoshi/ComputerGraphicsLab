//x=-y
package Practice;

import java.awt.*;
import javax.swing.JFrame;

public class Reflection_in_Graph extends Canvas {

    public void paint(Graphics g) {
        setBackground(Color.white);
        setForeground(Color.black);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        int xc = getWidth() / 2, yc = getHeight() / 2;
        g.drawLine(0, 0, getWidth(), getHeight());
        g.drawString("Reflection at x=-y in Graph", 30, 20);
        g.drawString("A", xc+4, yc-7);
        g.drawString("B", xc+101, yc-7);
        g.drawString("C", xc+45, yc-95);
        int[] x = {10, 100, 55};
        int[] y = {10, 10, 100};
        int[] x_ = {0, 0, 0};
        int[] y_ = {0, 0, 0};
        int[] xr = {0, 0, 0};
        int[] yr = {0, 0, 0};
        
        for (int i = 0; i < 3; i++) {
            x_[i] = xc + x[i];
            y_[i] = yc - y[i];
        }
        g.fillPolygon(x_, y_, 3);
 
        for (int i = 0; i < 3; i++) {
            xr[i] = y[i] * -1;
            yr[i] = x[i] * -1;
            System.out.println(xr[i]);
                        System.out.println(yr[i]);

        }
        g.drawString("A'", xc+(-10), yc-(-15));
        g.drawString("B'", xc+(-10), yc-(-103));
        g.drawString("C'", xc+(-110), yc-(-65));
        for (int i = 0; i < 3; i++) {
            x_[i] = xc + xr[i];
            y_[i] = yc - yr[i];
        }

        g.setColor(Color.blue);
        g.fillPolygon(x_, y_, 3);

    }

    public static void main(String[] args) {
        Reflection_in_Graph m = new Reflection_in_Graph();

        JFrame f = new JFrame("Reflection at x=-y in Graph");
        f.add(m);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
