package testRadioButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class TestRadioButton extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton RadioMale;
	private JRadioButton RadioFemale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestRadioButton frame = new TestRadioButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestRadioButton() {
		initialize();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ClickButton = new JButton("Click");
		ClickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RadioMale.isSelected())
				{
					JOptionPane.showMessageDialog(RadioMale, "You are Male"); //JOptionPane daje mo¿liowœæ wyskakiwania okienek
				}
				if(RadioFemale.isSelected())
				{
					JOptionPane.showMessageDialog(RadioFemale, "You are Female");
				}
			}
		});
		
		ClickButton.setBounds(269, 40, 145, 53);
		contentPane.add(ClickButton);
		
		
		
		RadioMale = new JRadioButton("Male");
		buttonGroup.add(RadioMale);
		RadioMale.setBounds(58, 28, 127, 25);
		contentPane.add(RadioMale);
		
		RadioFemale = new JRadioButton("Female");
		buttonGroup.add(RadioFemale);
		RadioFemale.setBounds(58, 69, 127, 25);
		contentPane.add(RadioFemale);
	}
}
