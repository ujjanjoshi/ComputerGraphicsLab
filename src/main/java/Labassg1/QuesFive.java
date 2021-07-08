
package Labassg1;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class QuesFive extends Applet{
       public void paint(Graphics g) {
       g.drawOval(10, 10, 50, 100);
       

    }

    public static void main(String[] args) {
        QuesFive m = new QuesFive();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }
}
