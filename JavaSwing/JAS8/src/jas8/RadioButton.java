package jas8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButton extends JFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton python;
	private JRadioButton CPLus;
	private JRadioButton Csharp;
	private JRadioButton Java;
	private JButton Reset;
	private JLabel lb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
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
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lb1 = new JLabel("");
		lb1.setBounds(35, 199, 127, 16);
		contentPane.add(lb1);
		
		Java = new JRadioButton("Java");
		Java.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setText("Wybra³eœ: "+Java.getText());
			}
		});
		buttonGroup.add(Java);
		Java.setBounds(23, 49, 127, 25);
		contentPane.add(Java);
		
		Csharp = new JRadioButton("C#");
		Csharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setText("Wybra³eœ: "+Csharp.getText());
			}
		});
		buttonGroup.add(Csharp);
		Csharp.setBounds(23, 83, 127, 25);
		contentPane.add(Csharp);
		
		CPLus = new JRadioButton("C++");
		CPLus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setText("Wybra³eœ: "+CPLus.getText());
			}
		});
		buttonGroup.add(CPLus);
		CPLus.setBounds(23, 113, 127, 25);
		contentPane.add(CPLus);
		
		python = new JRadioButton("Python");
		python.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setText("Wybra³eœ: "+python.getText());
			}
		});
		buttonGroup.add(python);
		python.setBounds(23, 143, 127, 25);
		contentPane.add(python);
		
		
		
		Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonGroup.clearSelection();
			}
		});
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Java.isSelected())
				{
					lb1.setText("Wybra³eœ: "+Java.getText());
				}
				if(Csharp.isSelected())
				{
					lb1.setText("Wybra³eœ: "+Csharp.getText());
				}
				if(CPLus.isSelected())
				{
					lb1.setText("Wybra³eœ: "+CPLus.getText());
				}
				if(python.isSelected())
				{
					lb1.setText("Wybra³eœ: "+python.getText());
				}
			}
		});*/
		Reset.setBounds(204, 59, 97, 25);
		contentPane.add(Reset);
		
		
	}
}
