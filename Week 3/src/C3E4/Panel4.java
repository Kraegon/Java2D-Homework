package C3E4;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Panel4 extends JPanel{

	public Panel4(){
		
	}
	
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		int size = 150;
		int x = (getWidth()/2) - (size/2);
		int y = (getHeight()/2) - (size/2);
		Area object = createShape(x,y,size);
		try {
			g.setPaint(new TexturePaint(ImageIO.read(new File("grassLight1.png")), new Rectangle2D.Double(x, y, size, size)));
		} catch (IOException e) {}
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
