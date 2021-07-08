
package Labassg1;
import java.awt.*;
import java.applet.*;
import javax.swing.JFrame;
public class QuesTwo extends Applet {
     public void paint(Graphics g){
        g.drawRoundRect(10, 10, 100,60,10,10);
    }
     public static void main(String[] args) {  
      QuesTwo m = new QuesTwo();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
}
