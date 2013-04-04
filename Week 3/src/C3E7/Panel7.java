package C3E7;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Panel7 extends JPanel{
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.translate(getWidth()/2, getHeight()/2);
		
		AffineTransform tr = new AffineTransform();
		int size = 100;
		Rectangle2D object = new Rectangle2D.Double(-size/2, -size/2, size, size);
		tr.rotate(Math.toRadians(45),0,0);
		g.fill(tr.createTransformedShape(object));
	}
}
