package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestPassword extends JFrame{
	
	JPasswordField pass;
	JTextField tf1 , tf2;
	JButton bt1;
	JLabel lb1,lb2,lb3,lb4;
	String password = "Cosnowego";
	TestPassword()
	{
		setSize(700, 700);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb1 = new JLabel("Podaj Login");
		lb1.setBounds(30, 20, 100, 40);
		add(lb1);
		lb2 = new JLabel("Podaj Haslo");
		lb2.setBounds(30, 80, 100, 40);
		add(lb2);
		lb3 = new JLabel("");
		lb3.setBounds(180, 120, 100, 40);
		add(lb3);
		lb4 = new JLabel("");
		lb4.setBounds(30, 200, 300, 100);
		add(lb4);
		tf1 = new JTextField();
		tf1.setBounds(130, 20, 150, 40);
		add(tf1);
		pass = new JPasswordField();
		pass.setBounds(130, 80, 150, 40);
		add(pass);
		bt1 = new JButton("Zaloguj siê");
		bt1.setBounds(30, 150, 250, 40);
		add(bt1);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(password.equals(String.valueOf(pass.getPassword())))
				{
					lb4.setText("Witaj "+tf1.getText());
					tf2.setText(String.valueOf(pass.getPassword()) );
				}
				else 
				{
					lb3.setText("Bledne haslo");
					lb4.setText("");
					tf2.setText("");
				}	
			}
		});
		
		tf2 = new JTextField();
		tf2.setBounds(30, 300, 150, 40);
		add(tf2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestPassword();

	}

}
