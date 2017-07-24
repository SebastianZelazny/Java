package obslugasciezkipliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sciezka {

	public static void main(String[] args) {

		Scanner UserInput = new Scanner(System.in);
		
		String sciezka = null;
		String sciezka1 = null;
		System.out.println("Podaj sciezke pliku");
		sciezka = UserInput.nextLine();
		System.out.println("Podaj sciezke drugiego pliku");
		sciezka1 = UserInput.nextLine();
		File open = new File(sciezka);
		File open1 = new File(sciezka1);
		try {
			Scanner in  = new Scanner(open);
			while(in.hasNextLine())
			{
				System.out.println(in.nextLine());
			}
			
			System.out.println("");
			System.out.println("Drugi plik");
			System.out.println("");
			
			Scanner in1  = new Scanner(open1);
			while(in1.hasNextLine())
			{
				System.out.println(in1.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Podana sciezka jest nieprawidlowa");
			//e.printStackTrace();
		}
		
	}

}
