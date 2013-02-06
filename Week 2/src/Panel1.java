import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Square, center and turned. Exercise 2.3
 * Simple. Effictive.      Brilliant.
 * @author Julian G. West
 */
public class Panel1 extends JPanel{
	
	public void paintComponent(Graphics gTemp) {
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	    
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    double theta = 45 * (Math.PI / 180);
	    g.rotate(theta);
	    
	    int h = 100;
	    int w = 100;
	    		
	    Rectangle2D object = new Rectangle2D.Double(-(0.5 * h),-(0.5 * w),h,w);
	    
	    g.draw(object);
	    
	}
}