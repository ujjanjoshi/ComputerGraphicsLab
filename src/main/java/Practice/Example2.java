package Practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Example2 extends Canvas {

    public void paint(Graphics g) {
        setBackground(Color.white);
        setForeground(Color.black);
        g.fillOval(100, 150, 100, 100);
        g.fillOval(350, 150, 100, 100);

        //g.setColor(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillOval(110, 160, 80, 80);
        g.fillOval(360, 160, 80, 80);
        g.setColor(Color.BLACK);
        g.drawLine(400, 200, 350, 60);
        g.drawLine(365, 100, 255, 200);
        g.drawLine(255, 200, 150, 200);
        g.drawLine(255, 200, 170, 90);
        g.drawLine(150, 200, 200, 130);
        g.drawLine(200, 130, 365, 100);
        g.drawLine(350, 60, 310, 50);
        g.drawLine(150, 90, 190, 90);
        g.drawLine(230, 150, 250, 170);
        g.drawLine(250, 170, 260, 160);
        g.drawLine(260, 160, 240, 140);
        g.drawLine(245, 140, 260, 125);
        g.drawLine(254, 130, 274, 150);
        g.drawLine(274, 150, 260, 150);
        g.drawLine(270, 130, 290, 120);
        g.drawLine(280, 125, 300, 150);
        g.drawLine(300, 150, 285, 150);
        g.drawLine(305, 115, 305, 140);
        g.drawLine(305, 115, 320, 130);
        g.drawLine(305, 130, 315, 125);
        g.drawLine(320, 115, 330, 125);
        g.drawLine(320, 115, 335, 120);
                g.drawLine(335, 120,325,110);



    }

    public static void main(String[] args) {
        Example2 m = new Example2();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
