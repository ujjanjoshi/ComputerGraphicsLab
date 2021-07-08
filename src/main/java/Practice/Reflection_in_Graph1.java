//x=y
package Practice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Reflection_in_Graph1 extends Canvas {
     public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
 	
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
 	
 	int xc=getWidth()/2,yc=getHeight()/2;
 	g.drawString("Reflection at x=y in Graph", 30, 20);
       g.drawLine(getWidth(),0,0,getHeight());
        g.drawString("A", xc+145, yc-7);
        g.drawString("B", xc+256, yc-7);
        g.drawString("C", xc+240, yc-96);
 	int [] x= {150,250,255};
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
     	xr[i]=y[i];
     	yr[i]=x[i];
     	}
        g.drawString("A'", xc+7, yc-140);
        g.drawString("B'", xc+7, yc-256);
        g.drawString("C'", xc+96, yc-240);
     	for (int i=0;i<3;i++){
     	x_[i]= xc + xr[i];
     	y_[i]= yc - yr[i];
     	}


        g.setColor(Color.blue);
        g.fillPolygon(x_,y_,3);  
	 
 	    
        
    } 
     
        public static void main(String[] args) {  
        Reflection_in_Graph1 m = new Reflection_in_Graph1();  

        JFrame f=new JFrame("Reflection at x=y in Graph");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);  
        f.setSize(600,600);  
        f.setVisible(true);  
    }  
}
