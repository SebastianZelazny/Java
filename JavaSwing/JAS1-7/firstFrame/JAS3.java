package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JAS3 extends JFrame implements ActionListener{

	String temp = "NOK";
	String BtText;
	JAS3()
	{
		setTitle("TestButton");
		setLayout(null);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton bt = new JButton("OK");
		bt.setBounds(30, 15, 70, 40);
		add(bt);
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BtText=((JButton)e.getSource()).getText();
				((JButton)e.getSource()).setText(temp);
				temp = BtText;
			}
		});
		
		JButton bt2 = new JButton("OK");
		bt2.setBounds(30, 80, 70, 40);
		add(bt2);
		bt2.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Jest OK");
		BtText=((JButton)e.getSource()).getText();
		((JButton)e.getSource()).setText(temp);
		temp = BtText;
		}
	
	
	
	public static void main(String[] args) {
		new JAS3();

	}
	

}
