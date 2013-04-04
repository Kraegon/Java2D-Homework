package C4E10;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Panel1 extends JPanel{
	SpriteTest player = new SpriteTest();
	private int theta = 0;
	int x;
	
	public Panel1(){
		Timer t = new Timer(1000/60, new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				theta += 5;
				x -= 10;
				theta %= getWidth() + 300;
				repaint();
			}
		});
		t.start();
	}
	
	public void paintComponent(Graphics gTemp){
		super.paintComponent(gTemp);
		Graphics2D g = (Graphics2D) gTemp;
		try {
			g.setPaint(new TexturePaint(ImageIO.read(new File("castleBackdrop2.png")), new Rectangle2D.Double(x, 0, 1320, 768)));
		} catch (IOException e) {}
		g.fill(new Rectangle2D.Double(0, 0, 1320, 768));
		g.translate(-300, 275);
		g.translate(theta,50);
		player.draw(g);
	}
}
