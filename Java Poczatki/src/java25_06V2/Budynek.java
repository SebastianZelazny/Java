package java25_06V2;

public class Budynek {
	
	
	private int pietra;
	private String ulica;
	private int numer;
	private String miasto;
	private int metrarz;
	private int ilosc_osob;
	
	public static double sredni_czynsz;
	
	public void info()
	{
		
	}
	public double czynsz()
	{
		double wynik=0;
		return wynik;
		
	}
	public void Przejdz_pietra()
	{
		if(getPietra()>0)
		{
			for(int i =0;i<getPietra();i++)
			{
				System.out.println("Jestem na "+i +" pietrze");
			}
		}
	}
	
	public int getMetrarz() {
		return metrarz;
	}
	
	public void setMetrarz(int metrarz) {
		this.metrarz = metrarz;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public int getNumer() {
		return numer;
	}
	public void setNumer(int numer) {
		this.numer = numer;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public int getPietra() {
		return pietra;
	}
	public void setPietra(int pietra) {
		this.pietra = pietra;
	}
	public int getIlosc_osob() {
		return ilosc_osob;
	}
	public void setIlosc_osob(int ilosc_osob) {
		this.ilosc_osob = ilosc_osob;
	}
	
	

}
