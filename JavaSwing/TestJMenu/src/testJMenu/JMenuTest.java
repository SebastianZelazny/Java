package testJMenu;

import java.awt.EventQueue;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuTest {

	private JFrame frame;
	private JMenu menu, submenu;
	private JMenuItem i1, i2, i3, i4, i5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuTest window = new JMenuTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JMenuTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		submenu=new JMenu("Sub Menu");
		i1=new JMenuItem("Item 1");
		i2=new JMenuItem("Item 2");
		i3=new JMenuItem("Item 3");
		i4=new JMenuItem("Item 4");
		i5=new JMenuItem("Item 5");
		menu.add(i1);menu.add(i2); menu.add(i3);submenu.add(i4); submenu.add(i5); menu.add(submenu);
		mb.add(menu);
		frame.setJMenuBar(mb);
	}

}
