import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
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
	Graphics2D g;
	
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
	    g = (Graphics2D)gTemp;
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    g.rotate(Math.toRadians(theta));	    
	    makeOrb(200,200,0);
	    makeOrb(200,-200,0);    
	    theta++;
	}
	
	public void makeOrb(int radius, int x, int y){
		
		//IT'S EASIER THAN IT LOOKS
		Ellipse2D base = new Ellipse2D.Double(-radius + x, -radius + y, 2*radius, 2*radius);
	    Rectangle2D supportRight  = new Rectangle2D.Double(x, -radius + y, radius, 2*radius);
	    
	    Ellipse2D top = new Ellipse2D.Double(-(0.5 * radius) + x, -radius + y, radius, radius);
	    Ellipse2D bottom = new Ellipse2D.Double(-(0.5 * radius) + x, y, radius,radius);
	    Ellipse2D fillingTop = new Ellipse2D.Double(-(0.05 * radius) + x, -((0.5 * radius) - (0.05 * radius)) + y, (0.1 * radius), (0.1 * radius));
	    Ellipse2D fillingBottom = new Ellipse2D.Double(-(0.05 * radius) + x, ((0.5 * radius) - (0.05 * radius)) + y, (0.1 * radius), (0.1 * radius));
	   
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

