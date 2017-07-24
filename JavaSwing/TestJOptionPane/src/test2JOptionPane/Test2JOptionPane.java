package test2JOptionPane;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test2JOptionPane extends WindowAdapter{

	private JFrame frame;
	private WindowEvent WindowEvent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2JOptionPane window = new Test2JOptionPane();
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
	public Test2JOptionPane() {
		initialize();
		WindowClosing(WindowEvent);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()  {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(this);
	}
	public void WindowClosing(WindowEvent e)
	{
		int a=JOptionPane.showConfirmDialog(frame, "Are you sure?");
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

}
