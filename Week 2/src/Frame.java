import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import C2E1.Panel1;
import C2E2.Panel2;
import C2E4.Panel3;
import C2E5.Panel4;
import C2E6.Panel5;
import C2E7.Panel6;
import C2E7.Panel7;

public class Frame {

	private JFrame frame;
	private JPanel[] panels;
	private static Frame INSTANCE;

	public Frame() {
		frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panels = new JPanel[8];
		panels[1] = new Panel1(); // 2.3
		panels[2] = new Panel2(); // 2.4A
		panels[3] = new Panel3(); // 2.4B
		panels[4] = new Panel4(); // 2.5
		panels[5] = new Panel5(); // 2.6
		panels[6] = new Panel6(); // 2.7A
		panels[7] = new Panel7(); // 2.7B
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
		frame.setSize(800, 800);
	}

	public JFrame getFrame() {
		return frame;
	}

	public static Frame getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Frame();
		return INSTANCE;
	}
}