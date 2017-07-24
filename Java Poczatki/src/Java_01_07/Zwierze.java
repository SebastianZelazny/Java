package Java_01_07;

public class Zwierze {

	private String typ_zwierze;
	private String poruszanie;
	private int wiek;
	public String getTyp_zwierze() {
		return typ_zwierze;
	}
	public void setTyp_zwierze(String typ_zwierze) {
		this.typ_zwierze = typ_zwierze;
	}
	public String getPoruszanie() {
		return poruszanie;
	}
	public void setPoruszanie(String poruszanie) {
		this.poruszanie = poruszanie;
	}
	
	public void move()
	{
		System.out.println("Jestem "+typ_zwierze+" I Poruszam siê "+poruszanie);
	}
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
}
