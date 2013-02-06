import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class Panel2 extends JPanel{
	
	public void paintComponent(Graphics gTemp) {
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	   
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    
	    int nPoints = 1000;
	    
	    int x1 = 0;
	    int x2;
	    int y1 = 0;
	    int y2;
	    
	    for(int i = 0; i < nPoints; i++){
	    	double t = i * Math.PI / 90;

	    	x2 = (int) (20 * t * Math.cos(t));
	    	y2 = (int) (20 * t * Math.sin(t));	    	
	    	g.drawLine(x1, y1, x2, y2);
	    	x1 = x2;
	    	y1 = y2;
	    }	    
	}
}
