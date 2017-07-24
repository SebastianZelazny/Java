package java25_06V2;

public class Biurowiec extends Uzytkowy {
	
	private String nazwa_budynku;
	
	public void info()
	{
		System.out.println(getMiasto());
		System.out.println(getNazwa_budynku());
		System.out.println(getUlica());
		System.out.println(getNumer());
		System.out.println(getPietra());
		System.out.println(getMetrarz());
		System.out.println(getIlosc_osob());
		
	}
	
	public double czynsz()
	{
			double n= 0.75;
			double wynik = ((getIlosc_osob() + getMetrarz()*n)/getPietra())*1.63;
			return wynik;
	}

	public String getNazwa_budynku() {
		return nazwa_budynku;
	}

	public void setNazwa_budynku(String nazwa_budynku) {
		this.nazwa_budynku = nazwa_budynku;
	}

}
