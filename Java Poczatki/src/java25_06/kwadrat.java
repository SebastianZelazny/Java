package java25_06;

public class kwadrat extends Figura{
	
	

	kwadrat(int szerokosc) {
		super(szerokosc, szerokosc);
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	public void pole()
	{
		int wynik = getSzerokosc()*getSzerokosc();
		System.out.println(wynik);
	}
	
	public void obwod()
	{
		int wynik = getSzerokosc()*4;
		System.out.println(wynik);
		
	}

}
