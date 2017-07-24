package testTable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class TableTest {

	private JFrame frame;
	private JTable table;
	private JButton btnUpdate;
	private DefaultTableModel defTab;
	private Vector<String> names2 = new Vector<>();
	private Vector<Vector<String>> data2 = new Vector<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest window = new TableTest();
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
	public TableTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String [][] data = {{"101","Amit","6700"},{"102","Jaj","7000"},{"103","Brak","10000"}};
		String [][] update = {{"101","Loki","21381"},{"102","Toki","7023300"},{"103","Boki","123312"}};
		String[] names = {"ID","Name","Salary"};
		
		names2.add("ID");
		names2.add("Name");
		names2.add("Salary");
		
		//String[] pierwszy = {"101","Amit","6700"};
		
		Vector<String> pierwszy = new Vector<>();
		pierwszy.add("101");
		pierwszy.add("Amit");
		pierwszy.add("6700");
		
		data2.add(pierwszy);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		defTab = new DefaultTableModel(data, names);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(178, 106, 242, 134);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(new DefaultTableModel(data,names));
		scrollPane.setViewportView(table);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel NewModel = new DefaultTableModel(data2,names2);
				table.setModel(NewModel);
				((DefaultTableModel)table.getModel()).fireTableDataChanged();
				
			}
		});
		btnUpdate.setBounds(57, 110, 97, 25);
		frame.getContentPane().add(btnUpdate);
	}
}
