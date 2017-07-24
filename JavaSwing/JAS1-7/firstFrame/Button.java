package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame implements ActionListener {
	JButton bt,bt2;
	Button()
	{
		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt = new JButton("Zatwierdz");
		bt.setBounds(30, 30, 100, 20);
		add(bt);
		bt2 = new JButton("ok");
		bt2.setBounds(30, 60, 100, 20);
		add(bt2);
		bt2.addActionListener(this);
		// albo	bt.addActionListener(this);
	/*	bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				((JButton)e.getSource()).setText("Jest Super");
				
			}
		});
		*/
		
	}
	
	Button(String title)
	{
		this();
		this.setTitle(title);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JFrame)
		{
			System.out.println("TAK");
		}
		
	}
}

