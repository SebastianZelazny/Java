package jas17;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JAS17JMenuBar implements ActionListener {

	private JFrame frame;
	private JMenuBar MenuB;
	private JMenu file,edit,help;
	private JMenuItem cut,copy,paste,selectAll,OpenFile,SaveToFile;
	private JTextArea ta;
	private FileWriter FWrite;
	private JFileChooser fileSave,fileOpen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAS17JMenuBar window = new JAS17JMenuBar();
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
	public JAS17JMenuBar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		SaveToFile = new JMenuItem("SaveToFile");
		OpenFile = new JMenuItem("OpenFile");
		selectAll = new JMenuItem("selectAll");
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		SaveToFile.addActionListener(this);
		OpenFile.addActionListener(this);
		
		MenuB = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("edit");
		help = new JMenu("help");
		file.add(OpenFile);
		file.add(SaveToFile);
		edit.add(copy);
		edit.add(cut);
		edit.add(paste);
		edit.add(selectAll);
		MenuB.add(file);
		MenuB.add(edit);
		MenuB.add(help);
		ta = new JTextArea();
		ta.setBounds(5,5,360,320);
		
		
		
		
		frame.add(MenuB);
		frame.add(ta);
		frame.setJMenuBar(MenuB);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==selectAll)
		{
			ta.selectAll();
		}
		if(e.getSource()==OpenFile)
		{
			fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			String read = "";
			try {
				Scanner in  = new Scanner(fileOpen.getSelectedFile());
				while(in.hasNext())
				{
				read+=in.nextLine()+"\n";
				ta.setText(read);
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==SaveToFile)
		{
			try {
				fileSave = new JFileChooser(); //do ktorego zadania 
				//fc.showOpenDialog(frame);
				fileSave.showSaveDialog(frame);
				//System.out.println(fc.getCurrentDirectory());
				FWrite = new FileWriter(fileSave.getSelectedFile(),true);
				FWrite.write(ta.getText());
				FWrite.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
