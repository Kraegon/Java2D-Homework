package C3E11;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel11 extends JPanel{
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.translate(getWidth()/2, getHeight()/2);
		drawFunction(g, 1);
		Rectangle2D object = new Rectangle2D.Double(0, 0, 100, 100);
		g.fill(object);
	}
	
	public void drawFunction(Graphics2D g, int k){
		int x1 = 0;
	    int x2;
	    int y1 = 0;
	    int y2;	    
	    for(int t = -500; t < 500; t++){
	    	x2 = t;
	    	y2 = k * t;	    	
	    	g.drawLine(x1, y1, x2, y2);
	    	x1 = x2;
	    	y1 = y2;
	    }
	}
}
