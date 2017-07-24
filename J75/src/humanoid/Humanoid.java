package humanoid;

public abstract class Humanoid {

	private String imie;
	private int wzrost;
	private int wiek;
	private boolean samiec;
	private boolean dorosly;
	
	public Humanoid(String imie,int wzrost,int wiek,boolean samiec,boolean dorosly)
	{
		this.imie = imie;
		this.wzrost = wzrost;
		this.wiek= wiek;
		this.samiec = samiec;
		this.dorosly = dorosly;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public int getWzrost() {
		return wzrost;
	}
	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	public boolean isSamiec() {
		return samiec;
	}
	public void setSamiec(boolean samiec) {
		this.samiec = samiec;
	}
	public boolean isDorosly() {
		return dorosly;
	}
	public void setDorosly(boolean dorosly) {
		this.dorosly = dorosly;
	}
	
	public void interakcja(Humanoid hum)
	{
		
	}
	
}
