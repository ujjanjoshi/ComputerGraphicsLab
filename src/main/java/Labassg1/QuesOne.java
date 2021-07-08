
package Labassg1;
import java.applet.*;
import java.awt.*;
import javax.swing.JFrame;

public class QuesOne extends Applet{
    public void init(){
    setForeground(Color.red);
    Font f=new Font("Arial",Font.BOLD,18);
    setFont(f);
    }
    public void paint(Graphics g){
        g.drawString("Hello World",20, 20);
    }
     public static void main(String[] args) {  
      QuesOne m = new QuesOne();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
}
