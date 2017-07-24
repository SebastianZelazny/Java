package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestTextField extends JFrame {

	JTextField tf1,tf2,tf3;
	JButton bt1,bt2;
	TestTextField()
	{
		
		setSize(500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		tf1 = new JTextField();
		tf1.setBounds(10, 20, 100, 30);
		add(tf1);
		tf2 = new JTextField();
		tf2.setBounds(10, 60, 100, 30);
		add(tf2);
		tf3 = new JTextField();
		tf3.setBounds(10, 100, 100, 30);
		add(tf3);
		
		bt1 = new JButton("+");
		bt1.setBounds(130, 20, 200, 30);
		add(bt1);
		bt2 = new JButton("-");
		bt2.setBounds(130, 60, 200, 30);
		add(bt2);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				int c = a +b;
				
				tf3.setText(String.valueOf(c));
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				int c = a - b;
				
				tf3.setText(String.valueOf(c));
			}
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
	
		new TestTextField();
		

	}

}
