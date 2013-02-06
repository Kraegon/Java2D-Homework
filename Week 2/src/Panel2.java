
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.*;

@SuppressWarnings("serial")
/**
 * The line approach. Exercise 2.4 approach A
 * Unfillable and resizes badly.
 * @author Julian G. West
 */
public class Panel2 extends JPanel{
	JFrame frame;
	public Panel2(JFrame sourceFrame){
		frame = sourceFrame;
	}
	
	public void paintComponent(Graphics gTemp) {
		super.paintComponent(gTemp);
	    Graphics2D g = (Graphics2D)gTemp;
	    
	    int squareHeight = 100;
	    int squareWidth = 100;
	    int sectionAmount = 8;
	    int initialHeight = (int) frame.getHeight() / sectionAmount;
	    int initialWidth = (int) frame.getWidth() / sectionAmount;
	    
	    setSize(8 * squareHeight, 8 * squareWidth);
	    for(int i = 0; i < sectionAmount; i++){
	    	int height = initialHeight + (i * initialHeight);
	    	g.drawLine(height, 0, height, frame.getWidth());	    	
	    }
	    
	    for(int i = 0; i < sectionAmount; i++){
	    	int width = initialWidth + (i * initialWidth);
	    	g.drawLine(0, width, frame.getHeight(), width);
	    }
	    
	    System.out.println("Dimension frame: " + frame.getHeight() + "h " + frame.getWidth() + "w");
	    System.out.println("Dimension panel: " + getHeight() + "h " + getWidth() + "w");
	}
}

