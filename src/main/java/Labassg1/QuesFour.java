
package Labassg1;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class QuesFour extends Applet{
     public void paint(Graphics g) {
        g.drawLine(10, 10, 70, 30);
        g.drawLine(11, 11, 71, 31);
       

    }

    public static void main(String[] args) {
        QuesFour m = new QuesFour();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }
}
