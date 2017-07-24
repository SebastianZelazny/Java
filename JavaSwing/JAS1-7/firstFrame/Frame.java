package firstFrame;

import javax.swing.JFrame;

public class Frame {
	JFrame f;
	Frame()
	{
		f = new JFrame("OK");
		f.setVisible(true);
		f.setSize(500, 300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	Frame(String title)
	{
		this();
		f.setTitle(title);
	}
	

	public static void main(String[] args) {
		new Frame();
	}

}
