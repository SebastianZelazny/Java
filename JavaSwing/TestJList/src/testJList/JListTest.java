package testJList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest window = new JListTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JListTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 699, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		DefaultListModel<String> li1 = new DefaultListModel<>();
		li1.addElement("C");
		li1.addElement("C++");
		li1.addElement("C#");
		li1.addElement("Java");
		li1.addElement("PHP");
		DefaultListModel<String> li2 = new DefaultListModel<>();
		li2.addElement("Pascal");
		li2.addElement("Spring");
		li2.addElement("JavaScript");
		li2.addElement("Ruby");
		
		JList list = new JList(li1);
		list.setBounds(27, 84, 170, 95);
		frame.getContentPane().add(list);
		JList list_1 = new JList(li2);
		list_1.setBounds(234, 84, 170, 95);
		frame.getContentPane().add(list_1);
		
		JLabel lb1 = new JLabel("Pusta");
		lb1.setBounds(27, 46, 610, 25);
		frame.getContentPane().add(lb1);
		
		JButton bt1 = new JButton("Show");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data = "";
				if(list.getSelectedIndex()!=-1)
				{
					data = "Programing language Selected "+list.getSelectedValue();
					lb1.setText(data);
				}
				if(list_1.getSelectedIndex()!=-1)
				{
					data += " ,Freamework Selected ";
					for(Object frame: list_1.getSelectedValues())
					{
						data += frame+ " ";
					}
					lb1.setText(data);
				}
			}
		});
		bt1.setBounds(118, 8, 97, 25);
		frame.getContentPane().add(bt1);
		
		JFileChooser fc = new JFileChooser(); //do ktorego zadania 
		fc.showOpenDialog(frame);
		System.out.println(fc.getCurrentDirectory());
	}
}
