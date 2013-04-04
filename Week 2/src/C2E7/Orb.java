package C2E7;

import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.Timer;

public class Orb implements ActionListener{
	double radius;
	int x;
	int y;
	int theta;
	int rotationMethod;
	public final static int CLOCKWISE = 1;
	public final static int ANTICLOCKWISE = -1;
	public final static int NOROTATION = 0;
	Random random;
	
	public Orb(double radius, int x, int y, int rotationMethod) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		Timer updater = new Timer(10, this);
		updater.start();
		this.rotationMethod = rotationMethod;
		random = new Random();
	}
	
	public void actionPerformed(ActionEvent arg0){
		if(rotationMethod == ANTICLOCKWISE)
			theta --;
		else if(rotationMethod == CLOCKWISE)
			theta ++;
		else
			theta = 0;
		theta %= 360;
	}
	
	public void draw(Graphics2D g){	
		//Create -- IT'S EASIER THAN IT LOOKS
		Ellipse2D base = new Ellipse2D.Double(-radius + x, -radius + y, 2*radius, 2*radius);
	    Rectangle2D supportRight  = new Rectangle2D.Double(x, -radius + y, radius, 2*radius);
	    
	    Ellipse2D top = new Ellipse2D.Double(-(0.5 * radius) + x, -radius + y, radius, radius);
	    Ellipse2D bottom = new Ellipse2D.Double(-(0.5 * radius) + x, y, radius,radius);
	    Ellipse2D fillingTop = new Ellipse2D.Double(-(0.05 * radius) + x, -((0.5 * radius) + (0.05 * radius)) + y, (0.1 * radius), (0.1 * radius));
	    Ellipse2D fillingBottom = new Ellipse2D.Double(-(0.05 * radius) + x, ((0.5 * radius) - (0.05 * radius)) + y, (0.1 * radius), (0.1 * radius));
	    
	    g.rotate(Math.toRadians(theta), x, y);
	    
	    //Fill
	    Area rightRemains = new Area(base);
	    rightRemains.intersect(new Area(supportRight));
	    rightRemains.subtract(new Area(top));
	    rightRemains.subtract(new Area(fillingBottom));
	    
	    Area bottomArea = new Area(bottom);
	    bottomArea.subtract(new Area(fillingBottom));
	    
	    //Draw
	    g.draw(base);
	    g.fill(bottomArea);
	    g.fill(fillingTop);
	    g.fill(rightRemains);
	    
	    g.rotate(Math.toRadians(-theta), x, y);
	}
}