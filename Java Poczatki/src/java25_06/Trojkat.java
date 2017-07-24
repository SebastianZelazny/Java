package java25_06;

public class Trojkat extends Figura{
	
	private int szerokosc2;
	
	Trojkat(int wysokosc, int szerokosc,int szerokosc2) {
		super(wysokosc, szerokosc);
		this.setSzerokosc2(szerokosc2);
		
	}
	

	public void pole()
	{
		int wynik = (getSzerokosc2()+getSzerokosc())/2*getWysokosc();
		System.out.println(wynik);
	}
	
	public void obwod()
	{
		int wynik = getSzerokosc()+getSzerokosc()+getSzerokosc();
		System.out.println(wynik);
		
	}


	public int getSzerokosc2() {
		return szerokosc2;
	}


	public void setSzerokosc2(int szerokosc2) {
		this.szerokosc2 = szerokosc2;
	}

}
