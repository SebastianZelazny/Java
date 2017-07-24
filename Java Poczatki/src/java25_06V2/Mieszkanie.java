package java25_06V2;

public class Mieszkanie extends Mieszkalny {
	private boolean piwnica = false;

	public boolean isPiwnica() {
		return piwnica;
	}

	public void setPiwnica(boolean piwnica) {
		this.piwnica = piwnica;
	}
	
	public void info()
	{
		System.out.println(getMiasto());
		System.out.println(getUlica());
		System.out.println(getNumer());
		System.out.println(getPietra());
		System.out.println(getMetrarz());
		System.out.println(getIlosc_osob());
		
		System.out.println(isWlasnosc());	
	}
	
	public double czynsz()
	{
		if(isWlasnosc()==true)
		{
			double n= 0.25;
			double wynik = ((getIlosc_osob() + getMetrarz()*n)/getPietra())*1.05;
			return wynik;
		}
		else
		{
			double n= 0.75;
			double wynik = ((getIlosc_osob() + getMetrarz()*n)/getPietra())*1.05;
			return wynik;
		}
		
	}

}
