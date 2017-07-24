package firstFrame;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class TestCheckBox {
	
	TestCheckBox()
	{
		
		JFrame f= new JFrame("CheckBox Example");
		f.setSize(400,400);
		f.setLayout(null);
		JCheckBox checkBox1 = new JCheckBox("C++");
		checkBox1.setBounds(100,100, 50,50);
		f.add(checkBox1);
		JCheckBox checkBox2 = new JCheckBox("Java", true);
		checkBox2.setBounds(100,150, 50,50);
		f.add(checkBox2);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new TestCheckBox();

	}

}
