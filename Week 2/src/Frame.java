import javax.swing.*;

public class Frame{
	
	private static JFrame frame;		
	
	public static void main(String[] args){		
		frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = new Panel1();
		
		//frame.setResizable(false);
		frame.setContentPane(content);
		frame.setVisible(true);
		frame.setSize(800,800);
	}
	
	
}