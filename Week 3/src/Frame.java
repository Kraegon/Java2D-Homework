import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import C3E1.Panel1;
import C3E10.Panel10;
import C3E11.Panel11;
import C3E12.Panel12;
import C3E2.Panel2;
import C3E3.Panel3;
import C3E4.Panel4;
import C3E5.Panel5;
import C3E6.Panel6;
import C3E7.Panel7;
import C3E8.Panel8;
import C3E9.Panel9;

public class Frame{
	
	private static JFrame frame;		
	
	public static void main(String[] args){		
		frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel[] panels = new JPanel[13];
		panels[1] = new Panel1(); //3.1
		panels[2] = new Panel2(); //3.2
		panels[3] = new Panel3(); //3.3
		panels[4] = new Panel4(); //3.4
		panels[5] = new Panel5(); //3.5
		panels[6] = new Panel6(); //3.6
		panels[7] = new Panel7(); //3.7
		panels[8] = new Panel8(); //3.8
		panels[9] = new Panel9(); //3.9
		panels[10] = new Panel10(); //3.10
		panels[11] = new Panel11(); //3.11
		panels[12] = new Panel12(); //3.12
		JMenuBar menuBar = new JMenuBar();
		JMenu setMenu = new JMenu("Panels");
		for(int i = 1; i < panels.length; i++){
			JMenuItem item = new JMenuItem("Panel " + i);
			final JPanel associate = panels[i];
			item.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setContentPane(associate);
					frame.revalidate();
				}
			});
			setMenu.add(item);
		}
		menuBar.add(setMenu);
		frame.setJMenuBar(menuBar);
		JPanel content = panels[1];
		
		frame.setContentPane(content);
		frame.setVisible(true);
		frame.setSize(1600,800);
	}
	
	
}