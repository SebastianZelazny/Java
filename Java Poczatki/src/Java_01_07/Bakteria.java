package Java_01_07;

public class Bakteria extends Organizm{

	private String typ_bakterii;

	private boolean grozna;
	
	public String getTyp_bakterii() {
		return typ_bakterii;
	}

	public void setTyp_bakterii(String typ_bakterii) {
		this.typ_bakterii = typ_bakterii;
	}

	public boolean isGrozna() {
		return grozna;
	}

	public void setGrozna(boolean grozna) {
		this.grozna = grozna;
	}
	
	private void odglos(String glos)
	{
		System.out.println("robie "+glos);
	}
	
	public void interkacja()
	{
		
	}

}
