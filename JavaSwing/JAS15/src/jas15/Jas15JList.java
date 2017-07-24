package jas15;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jas15JList {

	private JFrame frame;
	private DefaultListModel<String> imie,nazwisko;
	private String wynik="",imie1="",nazwisko1="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jas15JList window = new Jas15JList();
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
	public Jas15JList() {
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
		imie = new DefaultListModel<>();
		imie.addElement("Sebastian");
		imie.addElement("Ala");
		imie.addElement("Karolina");
		imie.addElement("Tomek");
		imie.addElement("Olek");
		nazwisko = new DefaultListModel<>();
		nazwisko.addElement("Tolek");
		nazwisko.addElement("Bolek");
		nazwisko.addElement("Olek");
		nazwisko.addElement("Colek");
		nazwisko.addElement("Folek");
		JLabel lblWynik = new JLabel("");
		lblWynik.setBounds(27, 37, 393, 16);
		frame.getContentPane().add(lblWynik);
		
		JLabel lblLiczbaLiterImie = new JLabel("");
		lblLiczbaLiterImie.setBounds(37, 66, 129, 16);
		frame.getContentPane().add(lblLiczbaLiterImie);
		
		JLabel lblLiczbaLiterNazwi = new JLabel("");
		lblLiczbaLiterNazwi.setBounds(168, 66, 183, 16);
		frame.getContentPane().add(lblLiczbaLiterNazwi);
		
		JList jli1 = new JList(imie);
		jli1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				imie1=String.valueOf(jli1.getSelectedValue());
				lblWynik.setText(imie1 +" "+nazwisko1);
				lblLiczbaLiterImie.setText("Liczba liter imie: "+imie1.length());
			}
		});
	
		jli1.setBounds(45, 110, 172, 130);
		frame.getContentPane().add(jli1);
		
		JList jli2 = new JList(nazwisko);
		jli2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				nazwisko1 =""+jli2.getSelectedValue();
				lblWynik.setText(imie1+" "+nazwisko1);
				nazwisko1=String.valueOf(jli2.getSelectedValue());
				lblLiczbaLiterNazwi.setText("Liczba liter nazwisko: "+nazwisko1.length());
			}
		});
		jli2.setBounds(233, 109, 172, 131);
		frame.getContentPane().add(jli2);
		
		JLabel lblImie = new JLabel("Imie");
		lblImie.setBounds(45, 92, 56, 16);
		frame.getContentPane().add(lblImie);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(233, 92, 56, 16);
		frame.getContentPane().add(lblNazwisko);
		
		
	}
}
