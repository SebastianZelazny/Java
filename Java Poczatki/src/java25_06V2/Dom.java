package java25_06V2;

public class Dom extends Mieszkalny{
	
	private boolean ogrod = false;
	private boolean garaz = false;
	

	
	public void info()
	{
		System.out.println(getMiasto());
		System.out.println(getUlica());
		System.out.println(getNumer());
		System.out.println(getPietra());
		System.out.println(getMetrarz());
		System.out.println(getIlosc_osob());
		
		System.out.println(isWlasnosc());
		
		System.out.println(isGaraz());
		System.out.println(isOgrod());
		
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
	public boolean isGaraz() {
		return garaz;
	}
	public void setGaraz(boolean garaz) {
		this.garaz = garaz;
	}
	public boolean isOgrod() {
		return ogrod;
	}
	public void setOgrod(boolean ogrod) {
		this.ogrod = ogrod;
	}

}
