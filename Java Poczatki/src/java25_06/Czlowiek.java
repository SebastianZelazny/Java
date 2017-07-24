package java25_06;

public class Czlowiek extends Byt {
	private String imie;
	private String nazwisko;
	
	public void rusz_reka()
	{
		System.out.println("Ruszam rêka");
	}
	
	
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	

}
