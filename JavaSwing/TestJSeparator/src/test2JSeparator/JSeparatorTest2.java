package test2JSeparator;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class JSeparatorTest2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSeparatorTest2 window = new JSeparatorTest2();
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
	public JSeparatorTest2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame f = new JFrame("Separator Example");
		f.setSize(515, 339);
		f.getContentPane().setLayout(null);
		JLabel l1 = new JLabel("Above Separator");
		l1.setSize(100, 50);
		l1.setLocation(10, 10);
		f.getContentPane().add(l1);
		JLabel l2 = new JLabel("Below Separator");
		l2.setSize(100, 50);
		l2.setLocation(146, 10);
		f.getContentPane().add(l2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(122, 13, 1, 47);
		f.getContentPane().add(separator);
		
	}
}
