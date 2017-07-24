package testJProgresBar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgresBarTest {

	private JFrame frame;
	private JProgressBar jb;
	private int i=0,num=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgresBarTest window = new JProgresBarTest();
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
	public JProgresBarTest() {
		initialize();
		iterate();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb=new JProgressBar(0,2000);
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		jb.setStringPainted(true);
		frame.add(jb);
		
	
	}
	public void iterate(){
		while(i<=2000){
		jb.setValue(i);
		i=i+20;
		try{Thread.sleep(150);}catch(Exception e){}
		}}
}
	
		

