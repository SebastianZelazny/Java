package testComboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ComboBoxTest {

	private JFrame frame;
	private String[] language = {"C","C++","C#","Java","Python","PHP"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxTest window = new ComboBoxTest();
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
	public ComboBoxTest() {
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
		
		JLabel label = new JLabel("");
		label.setBounds(31, 134, 259, 16);
		frame.getContentPane().add(label);
		
		JComboBox comboBox = new JComboBox(language);
		comboBox.setBounds(39, 47, 97, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Programing Data selected "+comboBox.getItemAt(comboBox.getSelectedIndex());
				label.setText(data);
			}
		});
		btnNewButton.setBounds(188, 46, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
