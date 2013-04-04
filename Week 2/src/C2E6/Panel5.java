package C2E6;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Member of the USS Enterprise. Exercise 2.6
 * Not exactly the same as before, but making the same thing twice wouldn't be interesting.
 * @author Julian G. West
 */
public class Panel5 extends JPanel{
	
	public void paintComponent(Graphics gTemp) {		
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	    
	    g.translate(getWidth() / 2 - 100, getHeight() / 2); 
	    g.rotate(Math.toRadians(90));
	    
	    GeneralPath path = new GeneralPath();
		    path.moveTo(0,0);
		    path.quadTo(-600,-100,0,-200);
		    path.quadTo(-150, -125, 0, 0);
	    path.closePath();
	    
	    Ellipse2D backdrop = new Ellipse2D.Double(-200, -275, 150, 350);	    
	    g.setColor(Color.yellow);
	    g.draw(backdrop);
	    g.fill(backdrop);
	    g.setColor(Color.gray);
	    g.draw(path);
	    g.fill(path);

	}
}

