package humanoid;

public class Moneky extends Humanoid{
	
	public Moneky(String imie, int wzrost, int wiek, boolean samiec, boolean dorosly) {
		super(imie, wzrost, wiek, samiec, dorosly);
		// TODO Auto-generated constructor stub
	}

	private String Gatunek;

	public String getGatunek() {
		return Gatunek;
	}

	public void setGatunek(String gatunek) {
		Gatunek = gatunek;
	}
	@Override
	public void interakcja(Humanoid hum)
	{
		if(hum instanceof phone==false)
		{
			System.out.println("Nie zadzwonisz nie posiadasz telefonu");
		}
	}

}
