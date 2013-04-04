package C3E9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel9 extends JPanel{
	public void paintComponent(Graphics gTemp){
		int k = 2;
		Graphics2D g = (Graphics2D) gTemp;
		g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.translate(getWidth()/2, getHeight()/2);
		drawFunction(g, k);
		Rectangle2D object = new Rectangle2D.Double(0, 100, 100, 50);
		g.fill(object);
		AffineTransform tr = new AffineTransform();
		tr.setTransform((2 / (1 + Math.pow(k, 2))) - 1, (2 * k) / (1 + Math.pow(k, 2)), (2 * k) / (1 + Math.pow(k, 2)), ((2 * Math.pow(k, 2) )   / (1 + Math.pow(k, 2))) - 1, 0, 0);
		g.setPaint(Color.RED);
		g.fill(tr.createTransformedShape(object));
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
