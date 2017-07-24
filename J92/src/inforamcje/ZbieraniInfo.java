package inforamcje;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZbieraniInfo {

	static Scanner user_input = new Scanner(System.in);
	static String imie = "";
	static String nazwisko = "";
	static int wiek = 0;
	void podaj_Imie()
	{
		boolean error = true;
		System.out.println("Podaj imie: ");
		imie = user_input.nextLine();
		while(true)
		{
			System.out.println("Podaj imie: ");
			imie = user_input.nextLine();
			try
			{
				Integer.parseInt(imie);
				System.out.println("Imie nie moze byc cyfra");
				continue;
			}
			catch (NumberFormatException e) {
				break;
			}
		}
		if(imie.isEmpty())
		{
			while(error)
			{
				System.out.println("Podaj imie: ");
				imie = user_input.nextLine();
				
				if(imie.isEmpty())
				{
					
				}
				else
				{
					error=false;
				}
			}
		}
		/*error =true;
		while(error)
		{
			System.out.println("Podaj imie: ");
			imie = user_input.nextLine();
			try
			{
				Integer.parseInt(imie);
				System.out.println("Imie nie moze byc cyfra");
				continue;
			}
			catch (NumberFormatException e) {
				System.out.println("Imie nie moze byc cyfra");
				break;
			}
		}*/
	}
	void podaj_Nazwisko()
	{
		boolean error = true;
		System.out.println("Podaj nazwisko: ");
		nazwisko = user_input.nextLine();
		
		while(true)
		{
			System.out.println("Podaj nazwisko: ");
			nazwisko = user_input.nextLine();
			try
			{
				Integer.parseInt(nazwisko);
				System.out.println("nazwisko nie moze byc cyfra");
				continue;
			}
			catch (NumberFormatException e) {
				break;
			}
		}
		
		if(nazwisko.isEmpty())
		{
			while(error)
			{
				System.out.println("Podaj nazwisko: ");
				nazwisko = user_input.nextLine();
				if(nazwisko.isEmpty())
				{
					
				}
				else
				{
					error=false;
				}
			}
		}
		
	}
	void podaj_Wiek()
	{
		while(true)
		{
			try
			{
				System.out.println("Podaj wiek: ");
				wiek = user_input.nextInt();
				user_input.nextLine();
				break;
			}
			catch (InputMismatchException e) {
				user_input.nextLine();
				System.out.println("Podano nieprawid³owa wartosc");
				continue;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		//C:\Users\Sebastian\Desktop\testowy1.txt
		ZbieraniInfo z = new ZbieraniInfo();
		z.podaj_Imie();
		z.podaj_Nazwisko();
		z.podaj_Wiek();
	
		String path;
		System.out.println("Podaj sciezke pliku do zapisu: ");
		
		try {
			path = user_input.nextLine();
			FileWriter newFile = new FileWriter(path, true);
			newFile.write("\n");
			newFile.write(" Imie: "+imie);
			newFile.write("\n");
			newFile.write(" Nazwisko: "+nazwisko);
			newFile.write("\n");
			newFile.write(" Wiek: "+wiek);
			newFile.write("\n");
			newFile.close();
		} catch (IOException e) {
			System.out.println("Cos poszlo nie tak");
			//e.printStackTrace();
		}
	}

}
