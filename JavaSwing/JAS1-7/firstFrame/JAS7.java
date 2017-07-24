package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JAS7 extends JFrame{
	
	JLabel lb1;
	JCheckBox cb1,cb2,cb3,cb4;
	JButton bt1;
	JTextArea ta1;
	
	public JAS7() {
		setTitle("Checkbox");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		cb1 = new JCheckBox("1");
		cb1.setBounds(10, 10, 60, 30);
		add(cb1);
		cb2 = new JCheckBox("2");
		cb2.setBounds(10, 30, 60, 30);
		add(cb2);
		cb3 = new JCheckBox("3");
		cb3.setBounds(10, 50, 60, 30);
		add(cb3);
		cb4 = new JCheckBox("4");
		cb4.setBounds(10, 70, 60, 30);
		add(cb4);
		lb1 = new JLabel("");
		lb1.setBounds(10, 160, 600, 40);
		add(lb1);
		ta1 = new JTextArea();
		ta1.setBounds(10, 200, 120, 70);
		add(ta1);
		bt1 = new JButton("Sprawdz");
		bt1.setBounds(10, 100, 150, 40);
		add(bt1);
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String wynik="";
				if(cb1.isSelected())
				{
					wynik+="CB1: Checked \n";
				}
				else
				{
					wynik+="CB1: UnChecked \n";
				}
				if(cb2.isSelected())
				{
					wynik+="CB2: Checked \n";
				}
				else
				{
					wynik+="CB2: UnChecked \n";
				}
				if(cb3.isSelected())
				{
					wynik+="CB3: Checked \n";
				}
				else
				{
					wynik+="CB3: UnChecked \n";
				}
				if(cb4.isSelected())
				{
					wynik+="CB4: Checked \n";
				}
				else
				{
					wynik+="CB4: UnChecked \n";
				}
				System.out.println(wynik);
				lb1.setText(wynik);
				ta1.setText(wynik);
			}
		});
		
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new JAS7();
	}

}
