package java25_06;

public class prostokat extends Figura {
	
	prostokat(int wysokosc, int szerokosc) {
		super(wysokosc, szerokosc);
		
	}
	

	public void pole()
	{
		int wynik = getSzerokosc()*getWysokosc()/2;
		System.out.println(wynik);
	}
	
	public void obwod()
	{
		int wynik = getSzerokosc()+getSzerokosc()+getSzerokosc();
		System.out.println(wynik);
		
	}

}
