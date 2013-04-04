package C3E8;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel8 extends JPanel{
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.translate(getWidth()/2, getHeight()/2);
		g.setFont(new Font("Comic SANS", Font.ITALIC, 36));
		g.drawString("Hello, 2D.", -180, 0);
		g.scale(-1, 1);
		g.drawString("Hello, 2D.", -180, 0);
		g.scale(-1, -1);
		g.drawString("Hello, 2D.", -180, 0);
		g.scale(-1, 1);
		g.drawString("Hello, 2D.", -180, 0);
	}
}
