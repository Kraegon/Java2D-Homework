package C2E4;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * A game of intellectuals. Exercise 2.4 approach B
 * Fully resizeable and easy to edit. A proud work.
 * @author Julian G. West
 */
public class Panel3 extends JPanel {
	
	public void paintComponent(Graphics gTemp) {
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;

	    int fieldDimension = 8; 
	    
	    boolean isBlack = false;
	    for(int y = 0; y < fieldDimension; y++){	    	
	    	for(int x = 0; x < fieldDimension; x++){
	    		Rectangle2D a = new Rectangle2D.Double((getWidth() / fieldDimension) * x, (getHeight() / fieldDimension) * y, getWidth() / fieldDimension, getHeight() / fieldDimension);
	    		if(isBlack)
	    			g.fill(a);
	    		g.draw(a);
	    		isBlack = !isBlack;
	    	}
	    	isBlack = !isBlack;
	    }    
	}
}

