package testJScrollBar;

import java.awt.EventQueue;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

public class JScrollBarTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JScrollBarTest window = new JScrollBarTest();
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
	public JScrollBarTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JScrollBar jsb = new JScrollBar();
		jsb.setBounds(145,83,173,157);
		frame.getContentPane().add(jsb);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 30, 248, 16);
		frame.getContentPane().add(lblNewLabel);
		jsb.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lblNewLabel.setText("Vertical value is; "+jsb.getValue());
				
			}
		});
		
		
	}
}
