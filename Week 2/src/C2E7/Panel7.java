package C2E7;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.*;
@SuppressWarnings("serial")
/**
 * Perfect balance. Exercise 2.7 approach B
 * Uses a lot of support sections to achieve its goal.
 * @author Julian G. West
 */
public class Panel7 extends JPanel{
	Graphics2D g;
	Orb orb;
	
	public Panel7(){
		orb = new Orb(150,0,0, Orb.CLOCKWISE);
		Timer timer = new Timer(1000/60, new ActionListener() {			
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
	    orb.draw(g);
	}
}

