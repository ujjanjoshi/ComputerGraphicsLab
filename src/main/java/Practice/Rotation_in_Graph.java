package Practice;

import java.applet.Applet;
import java.awt.*;
import javax.swing.JFrame;

public class Rotation_in_Graph extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.white);
        setForeground(Color.black);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        int xc = getWidth() / 2, yc = getHeight() / 2;
        int[] x = {10, 100, 55};
        int[] y = {10, 10, 100};
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = xc + x[i];
            b[i] = yc - y[i];
        }
        g.fillPolygon(a, b, 3);
        int theta = 90;
        int c[] = new int[3];
        int d[] = new int[3];
        double sinvalue = Math.sin(Math.toRadians(theta));
        double cosvalue = Math.cos(Math.toRadians(theta));
        for (int i = 0; i < 3; i++) {
            c[i] = (int) (xc + Math.round((x[i] * cosvalue) - (y[i] * sinvalue)));
            d[i] = (int) (yc - Math.round((y[i] * cosvalue) + (x[i] * sinvalue)));

        }
        g.setColor(Color.blue);
        g.fillPolygon(c, d, 3);

    }

    public static void main(String[] args) {
        Rotation_in_Graph m = new Rotation_in_Graph();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("2D Rotation");
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
