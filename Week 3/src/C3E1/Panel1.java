package C3E1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class Panel1 extends JPanel{
	ArrayList<Rectangle2D> rectangles;
	
	public Panel1(){
		rectangles = new ArrayList<Rectangle2D>();
		int x = 0;
		int y = 0;
		for(int i = 1; i <= 30; i++){
			rectangles.add(new Rectangle2D.Double(x + 5, y + 5, 150, 150));
			x += 160;
			if(i % 5 == 0){
				y += 160;
				x = 0;
			}
		}
	}
	
	public void paintComponent(Graphics gTemp){
		Graphics2D g = (Graphics2D) gTemp;
		for(Rectangle2D r : rectangles){
			//g.setPaint(pickColor());
			g.setPaint(pickColorDifferent());
			g.fill(r);
		}
	}
	
	public Color pickColorDifferent(){
		Random random = new Random();
		int r = random.nextInt(255);
		int g = random.nextInt(255);
		int b = random.nextInt(255);
		return new Color(r,g,b);
	}
	
	public Color pickColor(){
		Random random = new Random();
		Color color = Color.BLACK;
		switch(random.nextInt(9)){
			case 0:
				color = Color.BLACK;
				break;
			case 1:
				color = Color.BLUE;
				break;
			case 2:
				color = Color.CYAN;
				break;
			case 3:
				color = Color.GRAY;
				break;
			case 4:
				color = Color.GREEN;
				break;
			case 5:
				color = Color.ORANGE;
				break;
			case 6:
				color = Color.MAGENTA;
				break;
			case 7:
				color = Color.RED;
				break;
			case 8:
				color = Color.WHITE;
				break;
			case 9:
				color = Color.YELLOW;
				break;
		}
		return color;
	}
}
