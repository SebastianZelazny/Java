package java25_06V2;

public class General extends Wojskowy{
	private double dodatek = 8;

	public double getDodatek() {
		return dodatek;
	}

	public void setDodatek(double dodatek) {
		this.dodatek = dodatek;
	}
	
	public void ObliczPensje()
	{
		if(getStaz()<3)
		{
			double wynik = (getPensja()*getDodatek())*1;
			System.out.println(wynik);
		}
		else if(getStaz()>=3 && getStaz()<5)
		{
			double wynik = (getPensja()*getDodatek())*1.25;
			System.out.println(wynik);
		}
		else if(getStaz()>=5 && getStaz()<10)
		{
			double wynik = (getPensja()*getDodatek())*1.5;
			System.out.println(wynik);
		}
		else if(getStaz()>=10 && getStaz()<20)
		{
			double wynik = (getPensja()*getDodatek())*1.75;
			System.out.println(wynik);
		}
		else if(getStaz()>=20)
		{
			double wynik = (getPensja()*getDodatek())*2.25;
			System.out.println(wynik);
		}
	}
	public void WyswietlMedale()
	{
		System.out.println("Uzyskane medale"+List); 
	}
}
