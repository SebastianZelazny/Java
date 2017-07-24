package odczytFirma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class companyApp {
	
	public static void main(String[] args) throws IOException
	{
		
		Scanner user_Input = new Scanner(System.in);
		FileWriter zapisDoPlisku = new FileWriter("Pracownicy.txt",false);
		
		ArrayList<employee> lista = new ArrayList<>(3);
		String imie = "";
		String nazwisko = "";
		double wyplata=0;
		String decyzja = "a";
		String endLine = ";";
		boolean flaga = false;
		while(flaga!=true)
		{
			System.out.println("Dodajesz pracowanika");	
			System.out.println("Dodaj imie");
			imie = user_Input.nextLine();
			System.out.println("Dodaj Nazwisko");
			nazwisko = user_Input.nextLine();
			System.out.println("Dodaj Wyplate");
			wyplata = user_Input.nextDouble();
			user_Input.nextLine();
			System.out.println("Czy koniec t/n?");
			decyzja = user_Input.nextLine();
			if(decyzja.equals("t"))
			{
				zapisDoPlisku.write("Imie: "+imie+" Nazwisko: "+nazwisko+" Wyplata: "+wyplata+endLine+"\n");
				zapisDoPlisku.close();
				lista.add(new employee(imie, nazwisko, wyplata));
				flaga = true;
			}
			else
			{
				zapisDoPlisku.write("Imie: "+imie+" Nazwisko: "+nazwisko+" Wyplata: "+wyplata+endLine+"\n");
				lista.add(new employee(imie, nazwisko, wyplata));
			}
		
		}
		
		for(employee s:lista)
		{
			System.out.println("Imie pracownika: "+s.getImie()+"\nNazwisko: "+s.getNazwisko()+"\nWyplata: "+s.getWyplata());
		}
		
		File file = new File("Pracownicy.txt");
		Scanner in  = new Scanner(file);
		in.useDelimiter(";");
		
		while(in.hasNext())
		{	
			String wyp ="";
			while(in.hasNext())
			{	
				
				if(in.hasNext())
				{
					imie = in.next();
					
				}
				if(in.hasNext())
				{
					nazwisko = in.next();
					
				}
				if(in.hasNext())
				{
					 wyp = in.next();
				}
			
			
			System.out.println(imie+nazwisko+wyp);
			}
		}
	}
}
