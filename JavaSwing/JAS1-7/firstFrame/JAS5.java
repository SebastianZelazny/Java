package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JAS5 extends JFrame{

	JTextArea ta1,ta2;
	JButton bt1;
	JLabel lb1 ,lb2;
	JAS5()
	{
		setTitle("JAS5");
		setSize(700, 700);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta1 = new JTextArea();
		ta1.setBounds(50, 70, 300, 50);
		add(ta1);
		ta2 = new JTextArea();
		ta2.setBounds(50, 170, 300, 50);
		add(ta2);
		
		bt1 = new JButton("przenies");
		bt1.setBounds(50, 230, 300, 30);
		add(bt1);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String TMP ="";
				String TMP2 ="";
				TMP=ta1.getText();
				TMP2=ta2.getText();
				ta2.setText(TMP);
				ta1.setText(TMP2);
			
				
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JAS5();

	}

}
