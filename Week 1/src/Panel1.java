import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class Panel1 extends JPanel{
	
	
	
	public void paintComponent(Graphics gTemp) {
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	   
	    g.translate(200,200);

	    int x1 = 0;
	    int x2;
	    int y1 = 0;
	    int y2;
	    
	    for(int t = 0; t < 50; t++){
	    	x2 = (int) Math.pow(t, 2);
	    	y2 = (int) Math.pow(t, 3);	    	
	    	g.drawLine(x1, y1, x2, y2);
	    	x1 = x2;
	    	y1 = y2;
	    }
	    
	}
}
