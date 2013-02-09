import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	int theta = 0;
	
	public Panel7(){
		Timer timer = new Timer(1000/60, new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();				
			}
		});
		timer.start();
	}
	public Panel7(int speed){
		Timer timer = new Timer(speed/60, new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();				
			}
		});
		timer.start();
	}
	
	public void paintComponent(Graphics gTemp) {
		
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    g.rotate(Math.toRadians(theta));
	        
	    int radius = getHeight() / 2;
	     
	    Ellipse2D base = new Ellipse2D.Double(-radius, -radius, 2*radius, 2*radius);
	    Rectangle2D supportRight  = new Rectangle2D.Double(0, -radius, radius, 2*radius);
	    
	    Ellipse2D top = new Ellipse2D.Double(-(0.5 * radius), -radius, radius, radius);
	    Ellipse2D bottom = new Ellipse2D.Double(-(0.5 * radius), 0, radius,radius);
	    Ellipse2D fillingTop = new Ellipse2D.Double(-(0.05 * radius), -((0.5 * radius) - (0.05 * radius)), (0.1 * radius), (0.1 * radius));
	    Ellipse2D fillingBottom = new Ellipse2D.Double(-(0.05 * radius), ((0.5 * radius) - (0.05 * radius)), (0.1 * radius), (0.1 * radius));
	   
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
	    
	    
	    theta++;
	}
}

