package odczytFirma;

public class person {
	private String imie;
	private String nazwisko;
	
	public person(String imie,String nazwisko)
	{
		this.setImie(imie);
		this.setNazwisko(nazwisko);
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
