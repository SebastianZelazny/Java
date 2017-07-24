package java25_06;

public class Samochod {
	
	private String model;
	private String marka;
	private int Cena;
	static double srednia_cena;
	
	Samochod(String model,String marka,int Cena)
	{
		this.setModel(model);
		this.setMarka(marka);
		this.setCena(Cena);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getCena() {
		return Cena;
	}

	public void setCena(int cena) {
		Cena = cena;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

}
