
package Labassg1;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class QuesSeven extends Applet{
      public void paint(Graphics g) {
       g.drawString(".", 50, 20);
       

    }

    public static void main(String[] args) {
        QuesSeven m = new QuesSeven();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }
}
