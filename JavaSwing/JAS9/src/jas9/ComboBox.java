package jas9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBox {

	private JFrame frame;
	private String[] language = {"","C","C++","C#","Java","Python","PHP"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
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
	public ComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("");
		lb1.setBounds(58, 140, 56, 16);
		frame.getContentPane().add(lb1);
		
		JComboBox comboBox =  new JComboBox(language);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lb1.setText(""+comboBox.getItemAt(comboBox.getSelectedIndex()));
			}
		});
		/*comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lb1.setText(""+comboBox.getItemAt(comboBox.getSelectedIndex()));
			}
		});*/
	
		comboBox.setBounds(58, 71, 70, 22);
		frame.getContentPane().add(comboBox);
		
		
	}

}
