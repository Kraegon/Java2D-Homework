import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Perfect balance. Exercise 2.7 approach B
 * Uses a lot of support sections to achieve its goal.
 * @author Julian G. West
 */
public class Panel7 extends JPanel{
	
	public void paintComponent(Graphics gTemp) {		
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    
	    Ellipse2D base = new Ellipse2D.Double(-200, -200, 400, 400);
	    Rectangle2D supportRight  = new Rectangle2D.Double(0, -200, 200, 400);
	    
	    Ellipse2D top = new Ellipse2D.Double(-100, -200, 200,200);
	    Ellipse2D bottom = new Ellipse2D.Double(-100, 0, 200,200);
	    Ellipse2D fillingTop = new Ellipse2D.Double(-10, -110, 20, 20);
	    Ellipse2D fillingBottom = new Ellipse2D.Double(-10, 90, 20, 20);
	   
	    Area rightRemains = new Area(base);
	    rightRemains.intersect(new Area(supportRight));
	    rightRemains.subtract(new Area(top));
	    rightRemains.subtract(new Area(fillingBottom));
	    
	    Area bottomArea = new Area(bottom);
	    bottomArea.subtract(new Area(fillingBottom));
	    
	    g.setColor(Color.black);
	    g.draw(base);
	    g.fill(bottomArea);
	    g.fill(fillingTop);
	    g.fill(rightRemains);
	}
}

