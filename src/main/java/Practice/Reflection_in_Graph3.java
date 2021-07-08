//y=0
package Practice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Reflection_in_Graph3 extends Canvas{
        public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
 
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
 	
 	int xc=getWidth()/2,yc=getHeight()/2;
 	g.drawString("Reflection at y=0 in Graph", 30, 20);
         g.drawString("A", xc+100, yc-7);
        g.drawString("B", xc+207, yc-7);
        g.drawString("C", xc+150, yc-100);
 	int [] x= {110,200,155};
 	int [] y= {10,10,100};
	int [] x_= {0,0,0};
 	int [] y_= {0,0,0};
 	int [] xr= {0,0,0};
 	int [] yr= {0,0,0};
	
     	for (int i=0;i<3;i++){
     	x_[i]= xc + x[i];
     	y_[i]= yc - y[i];
     	}
     
        g.fillPolygon(x_,y_,3);
	
	
        for (int i=0;i<3;i++){
     	xr[i]=x[i];
     	yr[i]=y[i]*-1;
     	}
          g.drawString("A'", xc+(100), yc-(-15));
        g.drawString("B'", xc+(210), yc-(-15));
        g.drawString("C'", xc+(150), yc-(-115));
	
     	for (int i=0;i<3;i++){
     	x_[i]= xc + xr[i];
     	y_[i]= yc - yr[i];
     	}


        g.setColor(Color.blue);
        g.fillPolygon(x_,y_,3);  
	 
 	    
        
    } 
     
        public static void main(String[] args) {  
        Reflection_in_Graph3 m = new Reflection_in_Graph3();  

        JFrame f=new JFrame("Reflection at y=0 in Graph");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);  
        f.setSize(600,600);  
        f.setVisible(true);  
    }
}
