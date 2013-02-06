import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Hollow balance. Exercise 2.7 approach A
 * Cannot be filled: results in split down the middle.
 * @author Julian G. West
 */
public class Panel6 extends JPanel{
	
	
	public void paintComponent(Graphics gTemp) {		
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	    
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    //With a path, cannot properly be filled.
	    GeneralPath path = new GeneralPath(new Ellipse2D.Double(-200,-200,400,400));
	    	path.moveTo(0, -200);
	    	path.curveTo(150, -200, 150, 0, 0, 0);
	    	path.curveTo(-150, 0, -150, 200, 0, 200);	
	    	path.append(new Ellipse2D.Double(-10, -110, 20, 20), false);
	    	path.append(new Ellipse2D.Double(-10, 110, 20, 20), false);
	    path.closePath();
	   g.draw(path);
	}
}

