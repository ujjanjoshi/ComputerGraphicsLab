//origin

package Practice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author UKJ
 */
public class Reflection_in_Graph4 extends Canvas{
     public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
 	g.drawString("Reflection at origin in Graph", 30, 20);
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
 	
 	int xc=getWidth()/2,yc=getHeight()/2;
 	 g.drawString("A", xc+4, yc-7);
        g.drawString("B", xc+101, yc-7);
        g.drawString("C", xc+45, yc-95);
 	int [] x= {10,100,55};
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
     	xr[i]=x[i]*-1;
     	yr[i]=y[i]*-1;
     	}
	
          g.drawString("A'", xc+(-10), yc-(-15));
        g.drawString("B'", xc+(-50), yc-(-103));
        g.drawString("C'", xc+(-115), yc-(-15));
     	for (int i=0;i<3;i++){
     	x_[i]= xc + xr[i];
     	y_[i]= yc - yr[i];
     	}


        g.setColor(Color.blue);
        g.fillPolygon(x_,y_,3);  
	 
 	    
        
    } 
     
        public static void main(String[] args) {  
        Reflection_in_Graph4 m = new Reflection_in_Graph4();  

        JFrame f=new JFrame("Reflection at origin in Graph");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);  
        f.setSize(600,600);  
        f.setVisible(true);  
    }
}
