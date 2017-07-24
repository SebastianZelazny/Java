package polaczenieZBazaDanych;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DBTable {

	private JFrame frame;
	private JTable table;
	private DBConnect dbCon;
	private DefaultTableModel dtm, dtm1;
	private JComboBox comboBox;
	private Vector<String> tmp1;
	private String item;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBTable window = new DBTable();
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
	public DBTable() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			dbCon = DBConnect.MakeConnection("root", "Seb@stian1.");
			ResultSet rs = dbCon.getTable("skoczek");
			Vector<String> names = new Vector<>();
			ResultSet rsDB= dbCon.getCon().getMetaData().getTables(null, null, "%", null);
			tmp1 = new Vector<>();
			/*for(int i=1 ;i<rs.getMetaData().getColumnCount();i++) //zapisuje do wektora nazwy kolumn
			{
				tmp1.add(rsDB.getString(3));
			}*/
			while(rsDB.next())
			{
				tmp1.add((rsDB.getString(3)));
			}
			
			for(String e :tmp1) //Wyswiela wektor names
			{
				System.out.println(e);
			}
			for(int i=1 ;i<rs.getMetaData().getColumnCount();i++) //zapisuje do wektora nazwy kolumn
			{
				names.add(rs.getMetaData().getColumnName(i));
			}
			/*for(String e :names) //Wyswiela wektor names
			{
				System.out.println(e);
			}*/
			Vector<Vector<String>> data = new Vector<>(); //zapisuje do vektora  dwuwymiarowego wszystkich zawodnikow
			while(rs.next())
			{
				Vector<String> tmp = new Vector<>();
				for(int i =1;i<rs.getMetaData().getColumnCount();i++)
				{
					tmp.add(rs.getString(i));

				}
				data.add(tmp);
			}
			dtm = new DefaultTableModel(data, names);
			
		} catch (MySuperExcep e) {
			// TODO Auto-generated catch block
			e.cosSieStalo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(dbCon);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 78, 408, 162);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
		
		comboBox = new JComboBox(tmp1);
		
		comboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				item=String.valueOf(comboBox.getSelectedItem());
				System.out.println(item);
				try {
					Vector<String> names1 = new Vector<>();
					Vector<Vector<String>> data1 = new Vector<>();
					ResultSet rs = dbCon.getTable(item);
					
					for(int i=1 ;i<rs.getMetaData().getColumnCount()+1;i++) //zapisuje do wektora nazwy kolumn
					{
						names1.add(rs.getMetaData().getColumnName(i));	
					}
					while(rs.next())
					{
						Vector<String> tmp = new Vector<>();
						for(int i =1;i<rs.getMetaData().getColumnCount()+1;i++)
						{
							tmp.add(rs.getString(i));
						}
						data1.add(tmp);
					}
					
					dtm1 = new DefaultTableModel(data1, names1);
					table.setModel(dtm1);
					((DefaultTableModel)table.getModel()).fireTableDataChanged();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		});
		comboBox.setBounds(64, 24, 134, 22);
		frame.getContentPane().add(comboBox);
	}

}
