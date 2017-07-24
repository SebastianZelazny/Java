package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JAS4 extends JFrame{
	
	JButton bt1;
	JLabel lb1;
	JTextField tf1;
	
	JAS4()
	{
		setSize(500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		lb1 = new JLabel("Hello World!!!!");
		lb1.setBounds(20, 40, 100, 30);
		add(lb1);
		tf1 = new JTextField("Podaj imie:");
		tf1.setBounds(20, 70, 100, 30);
		add(tf1);
		bt1 = new JButton("OK");
		bt1.setBounds(20, 110, 100, 30);
		add(bt1);
		
		bt1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();
				lb1.setText("Witaj "+text);
			}
		});
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JAS4();

	}

}
