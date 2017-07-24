package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TestTextArea extends JFrame{

	JTextArea ta1;
	JButton bt1;
	JLabel lb1 ,lb2;
	TestTextArea()
	{
		setSize(700, 700);
		
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb1 = new JLabel("opis1");
		lb1.setBounds(50, 30, 100, 50);
		add(lb1);
		lb2 = new JLabel("opis1");
		lb2.setBounds(200, 30, 100, 50);
		add(lb2);
		ta1 = new JTextArea();
		ta1.setBounds(50, 70, 300, 100);
		add(ta1);
		bt1 = new JButton("Count");
		bt1.setBounds(50, 200, 100, 50);
		add(bt1);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = ta1.getText();
				String words[]=text.split("\\s");

				lb1.setText("Words: "+words.length);

				lb2.setText("Characters: "+text.length());
				
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestTextArea();

	}

}
