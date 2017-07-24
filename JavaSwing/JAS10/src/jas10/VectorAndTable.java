package jas10;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VectorAndTable {

	private JFrame frame;
	private JTable table;
	private Vector<Vector<String>> info2;
	private Vector<String> names2;
	private JTextField tfpesel;
	private JTextField tfImie;
	private JTextField tfNazwisko;
	private JTextField tfzarobki;
	private JTextField tf5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VectorAndTable window = new VectorAndTable();
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
	public VectorAndTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[][] info= {{"93020112","Sebastian","Zelazny","10000"},
						  {"93020112","Ala","Kot","10000"},
						  {"93020112","Tomek","Bubel","10000"},
						  {"93020112","Olek","Zzolek","10000"},
						  {"93020112","Buba","huba","10000"},
						  {"93020112","Mania","Ania","10000"},
						  {"93020112","Gabrysia","cos","10000"}};
		
		String[] names = {"Pesel","Imie","Nazwisko","Zarobki"};
		
		names2 = new Vector<>();
		names2.add("Pesel");
		names2.add("Imie");
		names2.add("Nazwisko");
		names2.add("Zarobki");
		
		info2 = new Vector<>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 796, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 82, 398, 218);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(new DefaultTableModel(info,names));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
			}
		});
		table.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
			}
		});
		table.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				table.remove(table.getSelectedRow());
				((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
			}
		});
		scrollPane.setViewportView(table);
		
		tfpesel = new JTextField();
		tfpesel.setBounds(33, 52, 116, 22);
		frame.getContentPane().add(tfpesel);
		tfpesel.setColumns(10);
		
		tfImie = new JTextField();
		tfImie.setBounds(33, 87, 116, 22);
		frame.getContentPane().add(tfImie);
		tfImie.setColumns(10);
		
		tfNazwisko = new JTextField();
		tfNazwisko.setBounds(33, 122, 116, 22);
		frame.getContentPane().add(tfNazwisko);
		tfNazwisko.setColumns(10);
		
		tfzarobki = new JTextField();
		tfzarobki.setBounds(33, 157, 116, 22);
		frame.getContentPane().add(tfzarobki);
		tfzarobki.setColumns(10);
		
		JButton bt1 = new JButton("Add");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vector<String> update = new Vector<>();
				update.add(tfpesel.getText());
				update.add(tfImie.getText());
				update.add(tfNazwisko.getText());
				update.add(tfzarobki.getText());
				((DefaultTableModel)table.getModel()).addRow(update);
				tfpesel.setText("");
				tfImie.setText("");
				tfNazwisko.setText("");
				tfzarobki.setText("");
				//System.out.println(update);
				
			}
		});
		bt1.setBounds(33, 192, 97, 25);
		frame.getContentPane().add(bt1);
		
		JLabel lblPesel = new JLabel("Pesel");
		lblPesel.setBounds(33, 34, 56, 16);
		frame.getContentPane().add(lblPesel);
		
		JLabel lblImie = new JLabel("Imie");
		lblImie.setBounds(33, 70, 56, 16);
		frame.getContentPane().add(lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(33, 109, 56, 16);
		frame.getContentPane().add(lblNazwisko);
		
		JLabel lblZarobki = new JLabel("Zarobki");
		lblZarobki.setBounds(33, 142, 56, 16);
		frame.getContentPane().add(lblZarobki);
		
		tf5 = new JTextField();
		tf5.setBounds(177, 157, 116, 22);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		
		JLabel lblDeleteRow = new JLabel("Delete row");
		lblDeleteRow.setBounds(183, 142, 97, 16);
		frame.getContentPane().add(lblDeleteRow);
		
		JButton bt2 = new JButton("Delete");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//((DefaultTableModel)table.getModel()).removeRow(Integer.parseInt(tf5.getText()));
				
			}
		});
		bt2.setBounds(177, 192, 97, 25);
		frame.getContentPane().add(bt2);
	}
}
