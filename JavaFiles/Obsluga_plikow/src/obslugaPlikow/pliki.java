package obslugaPlikow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class pliki extends Book{
	
	
	
	public pliki(String tytul, String autor, String rok) {
		super(tytul, autor, rok);
		
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		
	/*	File file = new File("ala.txt");
		Scanner in  = new Scanner(file);
		in.useDelimiter(",|\r?\n");
		
 
		while(in.hasNext())
		{
			int licznikA=0;
			int licznikO=0;
			
			for(int i =0;i<zdanie.length();i++)
			{
				if(zdanie.charAt(i)==97 || zdanie.charAt(i)==65 )
				{
					licznikA++;
				}
				if(zdanie.charAt(i)==111 || zdanie.charAt(i)==79)
				{
					licznikO++;
				}
				
			}
			
			if((licznikA>3 && licznikO>2) || (zdanie.contains("allow") ))
			{
				System.out.println(zdanie);
			}
			
		}
		in.close();	*/
		String tytul1="";
		String Autor="";
		String rokwyda ="";
		ArrayList<Book> lista = new ArrayList<>();
		File file = new File("ala.txt");
		Scanner in  = new Scanner(file);
		in.useDelimiter(",");
		
		
		while(in.hasNext())
		{	
			
			if(in.hasNext())
			{
				tytul1= in.next();
				
			}
			if(in.hasNext())
			{
				Autor = in.next();
				
			}
			if(in.hasNext())
			{
				rokwyda = in.next();
			}
		
			
			lista.add(new Book(tytul1, Autor, rokwyda));	
		}	
	
		for(Book s: lista)
		{
			System.out.println(" Nazwa: " + s.getTytul()+ "\n Autor: " + s.getAutor()+ "\n Rok wydania: " + s.getRok() + "\n");
		}
	}
}
