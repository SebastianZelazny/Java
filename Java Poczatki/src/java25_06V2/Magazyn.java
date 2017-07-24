package java25_06V2;

public class Magazyn extends Uzytkowy {
	private boolean parking = false;

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}
	
	public void info()
	{
		System.out.println(getMiasto());
		System.out.println(getUlica());
		System.out.println(getNumer());
		System.out.println(getPietra());
		System.out.println(getMetrarz());
		System.out.println(getIlosc_osob());
		System.out.println(isParking());	
	}
	
	public double czynsz()
	{
			double n= 0.75;
			double wynik = ((getIlosc_osob() + getMetrarz()*n)/getPietra())*1.31;
			return wynik;
	}
	

}
