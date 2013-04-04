package C3E6;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

public class Panel6 extends JPanel{
	
	public Panel6(){
		
	}
	
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		g.translate(getWidth()/2, getHeight()/2);
		g.setStroke(new BasicStroke(20, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
		drawPentagon(g,100);
	}
	public void drawPentagon(Graphics2D g, int radius){
		GeneralPath pentagon = new GeneralPath();
		Point2D origin = new Point2D.Double(0, 0);
		pentagon.moveTo(0, 0);
		pentagon.lineTo(0, -radius);
		pentagon.lineTo(radius * Math.sin(Math.toRadians(72)), (radius * Math.cos(Math.toRadians(72))));
		//pentagon.lineTo(-(radius * Math.sin(Math.toRadians(72))), -(radius * Math.cos(Math.toRadians(72))));
		g.draw(pentagon);
	}
}
