package zapisDoPlisku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zapis {

	public static void main (String[] args) throws IOException
	{
		/*PrintWriter newFile = new PrintWriter("pies.txt");
		newFile.print("pies ma kota");
		newFile.close();
		*/
		
		FileWriter nextfile = new FileWriter("pies.txt",true);
	/*	nextfile.write("New text");
		nextfile.close();*/
		
		
		
		Scanner user_input = new Scanner(System.in);
		
		String tekst = "";
		boolean flaga = false;
		while(flaga!=true)
		{
			System.out.println("Podaj tekst dla pliku (koniec - by zamknac wprwadzanie): ");
			tekst = user_input.nextLine();
			if(tekst.equals("koniec"))
			{
				nextfile.close();
				flaga = true;
			}
			else
			{
				nextfile.write(tekst);
				nextfile.write("\n");
			}
		}
		// do poprawy
		File file = new File("pies.txt");
		Scanner rl = new Scanner(file);
		while(rl.hasNext())
		{
			System.out.println(rl);
		}
	}
}
