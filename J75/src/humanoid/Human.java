package humanoid;

public class Human extends Humanoid{
	
	public Human(String imie, int wzrost, int wiek, boolean samiec, boolean dorosly) {
		super(imie, wzrost, wiek, samiec, dorosly);
		// TODO Auto-generated constructor stub
	}

	private String nazwisko;

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

}
