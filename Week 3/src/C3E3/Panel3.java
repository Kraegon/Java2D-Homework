package C3E3;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class Panel3 extends JPanel{

	public Panel3(){
		
	}
	
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		int size = 150;
		int x = (getWidth()/2) - (size/2);
		int y = (getHeight()/2) - (size/2);
		Area object = createShape(x,y,size);
		//g.setPaint(new GradientPaint(new Point2D.Double(x,y), Color.BLACK, new Point2D.Double(x+size,y+size), Color.WHITE)); //Diagonal
		g.setPaint(new GradientPaint(new Point2D.Double(x+(size/2),y), Color.BLACK, new Point2D.Double(x+(size/2),y+size), Color.WHITE)); //Vertical
		//g.setPaint(new GradientPaint(new Point2D.Double(x,y+(size/2)), Color.BLACK, new Point2D.Double(x+size,y+(size/2)), Color.WHITE)); //Horizontal
		g.fill(object);
	}
	
	public Area createShape(int x, int y, int size){
		Ellipse2D innerCircle = new Ellipse2D.Double(x + size/4, y + size/4, size / 2, size / 2);
		Rectangle2D container = new Rectangle2D.Double(x, y, size, size);
		
		Area shapeArea;
		shapeArea = new Area(container);
		shapeArea.subtract(new Area(innerCircle));
		
		return shapeArea;
	}
}
