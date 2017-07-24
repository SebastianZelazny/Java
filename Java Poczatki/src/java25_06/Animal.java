package java25_06;

public class Animal {
	
	private String imie;
	private String gatuenk;
	
	
	Animal(String imie,String gatunek)
	{
		this.setImie(imie);
		this.setGatuenk(gatunek);	
	}
	
	public void WydajGlos()
	{
		System.out.println("Mam na imie: "+getImie()+" I robie");
		if(getGatuenk()=="Kot")
		{
			System.out.print("Mialllllll");
		}
		else if(getGatuenk()=="Pies")
		{
			System.out.print("Hau hau hau");
		}
		else if(getGatuenk()=="Krowa")
		{
			System.out.print("Muuuuuuu");
		}
		else if(getGatuenk()=="Ptak")
		{
			System.out.print("kruu kruu");
		}
		
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getGatuenk() {
		return gatuenk;
	}

	public void setGatuenk(String gatuenk) {
		this.gatuenk = gatuenk;
	}
}
