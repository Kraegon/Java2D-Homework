package C3E12;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel12 extends JPanel{
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		int x = (getWidth()/2) - (150/2);
		int y = (getHeight()/2) - (150/2);
		Area shape = createShape(x,y,150);
		g.clip(shape);
		g.setFont(new Font("Comic SANS", Font.ITALIC, 40));
		g.drawString("Hello, 2D.", x, y + 75);
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
