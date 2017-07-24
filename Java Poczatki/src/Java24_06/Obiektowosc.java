package Java24_06;

import java.util.Scanner;

public class Obiektowosc {
	
	
	
	public static int dodaj (int a, int b)
	{
		return a +b;
	}
	
	public static void czesc()
	{
		System.out.println("Czeœæ !");
	}
	
	
	
	public static String Imie()
	{
		Scanner Output_user = new Scanner(System.in);
		System.out.print("Podaj imie: ");
		String imie = Output_user.next();
		return imie;
	}
	
	public static float mnozenie (float a, float b)
	{
		float wynik = a*b;
		return wynik;
	}
	public static void sprawdzenie()
	{
		Scanner Output_user = new Scanner(System.in);
		
		System.out.print("Podaj a: ");
		float a = Output_user.nextFloat();
		
		System.out.print("Podaj b: ");
		float b = Output_user.nextFloat();
		
		if(mnozenie(a, b)%2==0)
		{
			System.out.println("Parzysta");
		}
		else
		{
			System.out.println("Nieprarzysta");
		}
	}
	
	
	public static void main(String[] args) {
		
		/*System.out.println("Witaj "+Imie());
		sprawdzenie();*/
		
	/*	Dom parter = new Dom();
		parter.jakiDom();
		
		
		Dom pietrowy = new Dom();
		
		pietrowy.jakiDom();
		
		parter.metry2 = 150;
		pietrowy.metry2 = 100;
		
		pietrowy.jakiDom();
		parter.jakiDom();*/

	/*	pole_obowd obliczaniepola = new pole_obowd();*/
		
/*		obliczaniepola.Okwadrat(2);
		obliczaniepola.Pkwadrat(2);
		obliczaniepola.Oprostokat(2, 3);
		obliczaniepola.Pprostokat(4, 4);
		obliczaniepola.PTrojkat(3, 3);
		obliczaniepola.Otrojkat(3, 4, 5);*/
		
		
		
		
	}

}
