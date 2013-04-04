package C4E10;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

public class SpriteTest {
	BufferedImage player;
	
	int index = 0;
	int x,y;
	
	public SpriteTest(){
		try {
			player = ImageIO.read(new File("player3.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Timer t2 = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i <2; i++)
					update();
			}
		});
		t2.start();
	}
	
	public void update(){
		x = (index % 5)*240;
		y = (index / 5)*295;		
		index++;
		index %= 25;
	}
	
	public void draw(Graphics2D g){
		BufferedImage subImg = player.getSubimage(x, y, 240, 292);
		g.drawImage(subImg, 0, 0, 240, 292, null);
	}
}