package java25_06;

public class Uczen {
	
	public  String imie;  String nazwisko;  String pseudonim;
	boolean decyzja;
	
	Uczen (String imie, String nazwisko, String pseudonim)
	{
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.pseudonim=pseudonim;
		
	}
	Uczen (String imie, String nazwisko)
	{
		this.imie=imie;
		this.nazwisko=nazwisko;
	
		
	}
	
	public void PrzedstawSie(boolean decyzja)
	{
		if(decyzja==true)
		{
			System.out.println("Mam na imie: "+imie +" a na nazwisko: "+nazwisko);
			if(pseudonim==null)
			{
				System.out.println(". Znajomi mowia do mnie po imienu ");
			}
			else
			{
				System.out.println(". Znajomi wo³aj¹ na mnie: "+pseudonim);
			}
		}
	}


}
