package java25_06;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Szyfr {
	
	private String wiadomosc;
	private String wiadomosc_szyfr;
	
	Szyfr(String wiadomosc)
	{
		this.setWiadomosc(wiadomosc);
	}
	
	void UstawWiadomosc(String wiadomosc)
	{
		this.setWiadomosc(wiadomosc);
	}
	
	void Szyfruj()
	{
		setWiadomosc_szyfr("");
		for(int i =0; i<getWiadomosc().length();i++)
		{
			char character = getWiadomosc().charAt(i);
			if((int)character==120)
			{
				character = (char)(97);
				setWiadomosc_szyfr(getWiadomosc_szyfr() +character);
			}
			else if((int)character==121)
			{
				character = (char)(98);
				setWiadomosc_szyfr(getWiadomosc_szyfr() +character);
			}
			else if((int)character==122)
			{
				character = (char)(99);
				setWiadomosc_szyfr(getWiadomosc_szyfr() +character);
			}
			else
			{
				character = (char)(character +3);
				setWiadomosc_szyfr(getWiadomosc_szyfr() +character);
			}
		}
		
		System.out.println("Zaszyfrowane zdanie: "+getWiadomosc_szyfr());
	}
	
	void OdSzyfruj()
	{
		setWiadomosc("");
		for(int i =0; i<getWiadomosc_szyfr().length();i++)
		{
			char character = getWiadomosc_szyfr().charAt(i);
			if((int)character== 97)
			{
				character = (char)(120);
				setWiadomosc(getWiadomosc() +character);
			}
			else if((int)character== 98)
			{
				character = (char)(121);
				setWiadomosc(getWiadomosc() +character);
			}
			else if((int)character== 99)
			{
				character = (char)(122);
				setWiadomosc(getWiadomosc() +character);
			}
			else
			{
				character = (char)(character -3);
				setWiadomosc(getWiadomosc() +character);
			}
		}
		
		System.out.println("Odszyfrowane  zdanie: "+getWiadomosc());
		
	}

	public String getWiadomosc_szyfr() {
		return wiadomosc_szyfr;
	}

	public void setWiadomosc_szyfr(String wiadomosc_szyfr) {
		this.wiadomosc_szyfr = wiadomosc_szyfr;
	}

	public String getWiadomosc() {
		return wiadomosc;
	}

	public void setWiadomosc(String wiadomosc) {
		this.wiadomosc = wiadomosc;
	}
	
	

}
