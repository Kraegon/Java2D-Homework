package C3E2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel2 extends JPanel{
	
	public Panel2(){
		
	}
	
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		g.setPaint(Color.GREEN);
		g.fill(createShape(50,50));
	}
	public Area createShape(int x, int y){
		int size = 150;
		Ellipse2D innerCircle = new Ellipse2D.Double(x + size/4, y + size/4, size / 2, size / 2);
		Rectangle2D container = new Rectangle2D.Double(x, y, size, size);
		
		Area shapeArea;
		shapeArea = new Area(container);
		shapeArea.subtract(new Area(innerCircle));
		return shapeArea;
	}
}
