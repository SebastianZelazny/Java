package odczytFirma;

public class employee extends person{

	private double wyplata;
	public employee(String imie, String nazwisko,double wyplata) {
		super(imie, nazwisko);
		this.setWyplata(wyplata);
		
	}
	public double getWyplata() {
		return wyplata;
	}
	public void setWyplata(double wyplata) {
		this.wyplata = wyplata;
	}

}
