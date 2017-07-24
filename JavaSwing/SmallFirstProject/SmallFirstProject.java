package ReaktorPWN;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LastApp {

	public static void main(String[] args) {
		JFrame f = new JFrame("Pola wyboru");
		
		
		//Text Field 
		JLabel lbl5 = new JLabel("Przedstaw siê");
		lbl5.setBounds(20, 30, 150, 30);
		
		JLabel lbl1 = new JLabel("Imie");
		lbl1.setBounds(20, 70, 150, 30);
		JTextField tf1 = new JTextField("");
		tf1.setBounds(20, 100, 150, 30);
		
		JLabel lbl2 = new JLabel("Nazwisko");
		lbl2.setBounds(20, 170, 150, 30);
		JTextField tf2 = new JTextField("");
		tf2.setBounds(20, 200, 150, 30);
		
		JLabel lbl3 = new JLabel("Stanowisko");
		lbl3.setBounds(20, 270, 150, 30);
		JTextField tf3 = new JTextField("");
		tf3.setBounds(20, 300, 150, 30);
		
		JLabel lbl4 = new JLabel("Wiek");
		lbl4.setBounds(20, 370, 150, 30);
		JTextField tf4 = new JTextField("");
		tf4.setBounds(20, 400, 150, 30);
		
		
		
		//CheckBox
		JLabel lbl6 = new JLabel("Jêzyk programowania ");
		lbl6.setBounds(400, 30, 150, 30);
		
		Checkbox cb1 = new Checkbox("Python", false);
		cb1.setBounds(400, 60, 70, 10 );
		Checkbox cb2 = new Checkbox("Java", false);
		cb2.setBounds(400, 80, 70, 10 );
		Checkbox cb3 = new Checkbox("PHP", false);
		cb3.setBounds(400, 100, 70, 10 );
		Checkbox cb4 = new Checkbox("C#", false);
		cb4.setBounds(400, 120, 70, 10 );
		
		//GroupBox
		JLabel lbl7 = new JLabel("Jêzyk programowania ");
		lbl7.setBounds(400, 170, 150, 30);
		
		CheckboxGroup cbg = new CheckboxGroup(); 
		Checkbox cb5 = new Checkbox("Podstawowy",cbg, false);
		cb5.setBounds(400, 200, 120, 10 );
		Checkbox cb6 = new Checkbox("Srednio-zaawansowany",cbg, false);
		cb6.setBounds(400, 220, 120, 10 );
		Checkbox cb7 = new Checkbox("zaawansowany",cbg, false);
		cb7.setBounds(400, 240, 120, 10 );
		
		//Choice
		JLabel lbl8 = new JLabel("Jaki Kurs wybierasz ");
		lbl8.setBounds(400, 270, 150, 30);
		
		Choice c = new Choice();
		f.add(c);
		c.add("Back-end");
		c.add("Fron-end");
		
		c.setBounds(400, 300, 200, 50);
		
		
		//Button
		JButton b = new JButton("Wyswietl");
		b.setBounds(20, 450, 150, 30);
		
		JButton b2 = new JButton("Wyczyœæ");
		b2.setBounds(250, 450, 250, 30);
		
		//TextArea
		
		TextArea ta = new TextArea();
		ta.setBounds(20, 550, 500, 200);
		
		f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);f.add(cb5);f.add(cb6);f.add(cb7);
		f.add(lbl1);f.add(lbl2);f.add(lbl3);f.add(lbl4);f.add(lbl5);f.add(lbl6);f.add(lbl7);f.add(lbl8);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);
		f.add(b);f.add(b2);
		f.add(ta);
		f.add(c);
		
		
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean p1 = cb1.getState();
				boolean p2 = cb2.getState();
				boolean p3 = cb3.getState();
				boolean p4 = cb4.getState();
				boolean p5 = cb5.getState();
				boolean p6 = cb6.getState();
				boolean p7 = cb7.getState();
				
				ta.setText("Dane Kontaktowe: "+"\n"+"Imie: "+tf1.getText()+" "+"\n"+"Nazwisko: "+tf2.getText()+" "+"\n"+"Stanowsiko: "+tf3.getText()+" "+"\n"+"Wiek: "+tf4.getText()+"\n"+"\n"+"Wybrany jêzyk"+"\n"+"Python: "+p1+"\n"+"Java: "+p2+"\n"+"PHP: "+p3+"\n"+"C#: "+p4+"\n"+"\n"+"Poziom Jêzyka"+"\n"+"Podstawowy: "+p5+"\n"+"Œrednio-Zaawansowany: "+p6+"\n"+"Zaawansowany: "+p7+"\n"+"\n"+"\n"+"Wybrana kurs: "+"\n"+c.getSelectedItem()+"\n");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		
	}

}
