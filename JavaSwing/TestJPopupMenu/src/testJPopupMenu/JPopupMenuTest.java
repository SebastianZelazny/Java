package testJPopupMenu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JPopupMenuTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPopupMenuTest window = new JPopupMenuTest();
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
	public JPopupMenuTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel();
		label.setBounds(5,5,100,50);
		final JPopupMenu popupmenu = new JPopupMenu("Edit");
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		frame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				popupmenu.show(frame , e.getX(), e.getY());
			}});
		popupmenu.add(cut);popupmenu.add(copy);popupmenu.add(paste);
		cut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label.setText("cut MenuItem clicked.");
			}});
		copy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label.setText("copy MenuItem clicked.");
			}});
		paste.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label.setText("paste MenuItem clicked.");
			}});
				
		
		frame.add(popupmenu);frame.add(label);
	}

}
