package testJSeparator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JSeparatorTest {

	private JFrame frame;
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5;
	JMenuBar mb;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSeparatorTest window = new JSeparatorTest();
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
	public JSeparatorTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb=new JMenuBar();
		menu=new JMenu("Menu");
		i1=new JMenuItem("Item 1");
		i2=new JMenuItem("Item 2");
		menu.add(i1);
		menu.addSeparator();	//Mo¿e s³u¿yæ do tego bezposrednio funkcja z klasy JMenu
		menu.add(i2);
		mb.add(menu);
		frame.setJMenuBar(mb);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
