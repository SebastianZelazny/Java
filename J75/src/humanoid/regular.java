package humanoid;

import java.util.Scanner;

public class regular extends Human implements phone{
	
	public regular(String imie, int wzrost, int wiek, boolean samiec, boolean dorosly) {
		super(imie, wzrost, wiek, samiec, dorosly);
		// TODO Auto-generated constructor stub
	}
	
	private boolean CzyPolaczeny=false;
	private boolean zakoncz = false;
	Scanner user_inp = new Scanner(System.in);
	
	public boolean isCzyPolaczeny() {
		return CzyPolaczeny;
	}

	public void setCzyPolaczeny(boolean czyPolaczeny) {
		CzyPolaczeny = czyPolaczeny;
	}

	public boolean isZakoncz() {
		return zakoncz;
	}

	public void setZakoncz(boolean zakoncz) {
		this.zakoncz = zakoncz;
	}

	@Override
	public void dzwoni() {
		setCzyPolaczeny(true);
		System.out.println("Dzwonie");
		rozmawia();
		
	}

	@Override
	public void rozmawia() {

		if(isCzyPolaczeny()==true)
		{
			pytanie();
			odpowiedz();
		}
		
	}

	@Override
	public void koniec() {
		setCzyPolaczeny(false);
		
		
	}

	@Override
	public void pytanie() {
		if(isZakoncz()==false)
		{
			String Pytanie;
			System.out.println("Pytanie");
			Pytanie=user_inp.nextLine();
			System.out.println("Czy chcesz kontynuowac rozmowe t/n ?");
			String decyzja;
			decyzja =user_inp.nextLine();
			if(decyzja=="t")
			{
				setCzyPolaczeny(false);
				setZakoncz(true);
				
			}
			else
			{
				setCzyPolaczeny(true);
			}}
	}
	

	@Override
	public void odpowiedz() {
		
		if(isZakoncz()==false)
		{
			System.out.println("Odpowiedz");
			String Odpowiedz;
			Odpowiedz=user_inp.nextLine();
			System.out.println("Czy chcesz kontynuowac rozmowe t/n ?");
			String decyzja;
			decyzja =user_inp.nextLine();
			if(decyzja=="t")
			{
				setCzyPolaczeny(false);
				setZakoncz(true);
				
			}
			else
			{
				setCzyPolaczeny(true);
			}
		}
		else
		{
			System.out.println("Polaczenie zakonczone");
		}
			
		
	}

	public void interakcja(Humanoid hum)
	{
		
		if (hum instanceof regular)
		{
			while(isZakoncz()==false || this.isZakoncz()==false)
			{
				dzwoni();
			}
			
		}
			
	}


	
}
