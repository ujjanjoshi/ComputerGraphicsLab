
package Labassg1;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class QuesSix extends Applet {
      public void paint(Graphics g) {
       g.drawOval(60, 40, 50, 50);
       

    }

    public static void main(String[] args) {
        QuesSix m = new QuesSix();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }
}
