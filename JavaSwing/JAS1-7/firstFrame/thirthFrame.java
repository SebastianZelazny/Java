package firstFrame;

import javax.swing.JFrame;

public class thirthFrame extends JFrame {

	thirthFrame()
	{
		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	thirthFrame(String title)
	{
		this();
		this.setTitle(title);
	}
}
