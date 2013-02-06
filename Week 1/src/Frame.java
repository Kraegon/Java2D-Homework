import javax.swing.*;

public class Frame{
	
	private static JFrame frame;		
	
	public static void main(String[] args){		
		frame = new JFrame("Graph");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel content = new Panel1();
		
		frame.setContentPane(content);
		frame.setVisible(true);
		frame.setSize(600,600);
	}
	
	
}
