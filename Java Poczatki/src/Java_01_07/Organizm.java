package Java_01_07;

public abstract class Organizm {
	private double waga;
	private int wzrost;
	private String nazwa;
	private String plec;

	
	
	public double getWaga() {
		return waga;
	}

	public void setWaga(double waga) {
		this.waga = waga;
	}

	public int getWzrost() {
		return wzrost;
	}

	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	private void odglos(String glos)
	{
		System.out.println("robie "+glos);
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}
	
	public void interakcja()
	{
		
	}
	
}
