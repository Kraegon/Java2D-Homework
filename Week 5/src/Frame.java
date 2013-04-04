import javax.swing.JFrame;
import javax.swing.JPanel;

import C4E10.Panel1;

public class Frame{
	
	private JFrame frame;		
	private static Frame INSTANCE;
	
	public Frame(){
		frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel[] panels = new JPanel[8];
		panels[1] = new Panel1();
		
		JPanel content = panels[1];
		frame.setContentPane(content);
		frame.setVisible(true);
		frame.setSize(1320,768);
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	public static Frame getInstance(){
		if(INSTANCE == null)
			INSTANCE = new Frame();
		return INSTANCE;
	}
}