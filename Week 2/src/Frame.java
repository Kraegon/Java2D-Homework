import javax.swing.*;

public class Frame{
	
	private static JFrame frame;		
	
	public static void main(String[] args){		
		frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel[] panels = new JPanel[8];
		panels[1] = new Panel1(); //2.3
		panels[2] = new Panel2(); //2.4A
		panels[3] = new Panel3(); //2.4B
		panels[4] = new Panel4(); //2.5
		panels[5] = new Panel5(); //2.6
		panels[6] = new Panel6(); //2.7A
		panels[7] = new Panel7(); //2.7B
		
		JPanel content = panels[7];

		frame.setContentPane(content);
		frame.setVisible(true);
		frame.setSize(800,800);
	}
	
	
}