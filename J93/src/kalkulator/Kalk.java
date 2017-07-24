package kalkulator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalk {

	public static void main(String[] args)
	{
	Scanner userInput= new Scanner(System.in);
	
	double a = 0;
	double b = 0;
	
	
	while(true)
	{
		try
		{
			System.out.println("Podaj a: ");
			a =userInput.nextInt();
			userInput.nextLine();
			break;
		}
		catch (InputMismatchException e) {
			userInput.nextLine();
			System.out.println("Znak nie moze byc cyfra");
			continue;
		}
	}
	while(true)
	{
		try
		{
			System.out.println("Podaj b: ");
			b =userInput.nextInt();
			userInput.nextLine();
			break;
		}
		catch (InputMismatchException e) {
			userInput.nextLine();
			System.out.println("Znak nie moze byc cyfra");
			continue;
		}
	}
	
	
	
	
	
	System.out.println("Podaj operacje (*,/,+,-): ");
	String wybor ="";
	boolean error = true;
	end: while(error)  //tu jest etykieta 
	{
	
		wybor = userInput.nextLine();
		switch (wybor) {
			case "+":
			{
				dodoawanie dod = new dodoawanie(a, b);
				System.out.println("Wynik dodawania: "+dod.doda(a, b));
				error=false;
				break end; //tu jest etykieta zamyka wszystkie petle nadrzedne wtedy jedna linijka do gory nie potrzebna
			}
			case "-":
			{
				odejmowanie odej = new odejmowanie(a,b);
				odej.odejmo(a, b);
				error=false;
				break end; //tu jest etykieta zamyka wszystkie petle nadrzedne
			}
			case "*":
			{
				mnozenie mno = new mnozenie(a, b);
				mno.mnoze(a, b);
				error=false;
				break end; //tu jest etykieta zamyka wszystkie petle nadrzedne
			}
			case "/":
			{
				dzielenia dzie = new dzielenia(a, b);
				dzie.dziele(a, b);
				error=false;
				break end; //tu jest etykieta zamyka wszystkie petle nadrzedne
				
			}
			default:
				System.out.println("Podano nieprawidlowy znak");
				System.out.println("Podaj operacje (*,/,+,-): ");
				continue;
		}
	}
	
	}
}
