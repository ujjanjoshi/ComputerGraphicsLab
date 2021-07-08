package Labassg1;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class QuesThree extends Applet {

    public void paint(Graphics g) {
        g.drawLine(10, 10, 50, 10);
        g.drawLine(10, 10, 10, 50);
        g.drawLine(80, 10, 10, 60);
        g.drawLine(70, 20, 120, 60);

    }

    public static void main(String[] args) {
        QuesThree m = new QuesThree();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);
    }
}
