package C3E10;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel10 extends JPanel{
	
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.translate(getWidth()/2, getHeight()/2);
		g.setFont(new Font("Sarif",0,20));
		String text = "ENDLESS AND INFINITY";
		int theta = 360/text.length();
		for(char c : text.toCharArray()){
			g.rotate(Math.toRadians(theta),0,0);
			g.drawString(""+c, 0, -100);
			//theta += 360/text.length();
			theta %= 360;
		}
	}
}
