import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Solar eclipse. Exercise 2.5
 * Not the exact assignment, but with an attempt at animation/timer usage.
 * @author Julian G. West
 */
public class Panel4 extends JPanel{
	private int counter = 0;
	private boolean isIncrease = true;
	
	public Panel4(){
		Timer timer = new Timer(1000/60, new ActionListener() {			
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
	    
	    if(counter > 200)
			isIncrease = !isIncrease;
	    else if(counter < -200)
	    	isIncrease = !isIncrease;
	     
	    g.translate(getWidth() / 2, getHeight() / 2); 
	    Ellipse2D c1 = new Ellipse2D.Double(-100,-100, 200,200);
	    Ellipse2D c2 = new Ellipse2D.Double(-100 + counter,-100, 200, 200);
	
	    Area a1 = new Area(c1);
	    a1.subtract(new Area(c2));
	    Area a2 = new Area(c1);
	    a2.intersect(new Area(c2));
	    g.setColor(Color.yellow);
	    g.fill(a1);
	    g.setColor(Color.black);
	    g.fill(a2);
	    
	    if(isIncrease)
	    	counter++;
	    else
	    	counter--;
	}
}

