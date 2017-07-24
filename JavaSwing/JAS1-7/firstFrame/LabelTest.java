package firstFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelTest extends JFrame implements MouseListener{

	JLabel lb;
	JButton bt;
	public LabelTest() {
		setTitle("TestButton");
		setSize(600, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb = new JLabel("Hello World");
		lb.setBounds(30, 40, 100, 30);
		lb.addMouseListener(this);
		add(lb);
		bt = new JButton("Wcisnij mnie");
		bt.setBounds(30, 80, 150, 30);
		add(bt);
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			lb.setText("Witaj Swiecie");
				
			}
		});
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Mouse Click");
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse Entered");
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println(" mouseExited");
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println(" mousePressed");
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println(" mouseReleased");
		
	}

	
	
	
	
	public static void main(String[] args) {
		new LabelTest();

	}


	
}
