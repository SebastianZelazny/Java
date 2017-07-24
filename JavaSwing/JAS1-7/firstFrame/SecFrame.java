package firstFrame;

import javax.swing.JFrame;

public class SecFrame extends JFrame{
	
	SecFrame()
	{
		setTitle("okno33");
		setVisible(true);
		setSize(700, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	SecFrame(String title)
	{
		this();
		this.setTitle(title);
	}
}
