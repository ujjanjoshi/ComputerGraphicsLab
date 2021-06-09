package Practice;
import java.awt.*;
import javax.swing.*;
public class Example1 extends Canvas {
    public void paint(Graphics g){
        setBackground(Color.white); 
        setForeground(Color.black);   
        g.drawString("Computer Graphics",50,50);  
 		
        g.fillRect(50, 80,250,200);
        g.fillOval(125,280,100, 30);
	g.setColor(Color.blue);
        g.fillRect(55,85,240,190);
        g.setColor(Color.yellow);
        g.drawLine(55,150,295,150 );
        g.drawLine(55,150,175,275 );
        g.drawLine(175,275,295,150 );
        g.drawLine(55,230,295,230 );
         g.drawLine(175,85,295,230 );
          g.drawLine(55,230,175,85 );
          g.drawString("TU",165,200);
         
    }
      public static void main(String[] args) {  
       Example1 m = new Example1();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  

}
