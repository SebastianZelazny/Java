package java25_06V2;
import java.util.*;
public class Wojskowy {
	
	private String imie;
	private String nazwisko;
	private String stopien;
	private int staz;
	private double pensja = 1000;
	

	
	public ArrayList List = new ArrayList();
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getStopien() {
		return stopien;
	}

	public void setStopien(String stopien) {
		this.stopien = stopien;
	}

	public int getStaz() {
		return staz;
	}

	public void setStaz(int staz) {
		this.staz = staz;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	
	public void meldunek()
	{
		System.out.println("Melduje siê "+getStopien()+ " " +getImie() + " " +getNazwisko());
	}
	public void ObliczPensje()
	{
		
	}
	public void awansuj(String stopien)
	{
		setStopien(stopien);
	}
	
	public void dajMedal(String medal)
	{
		List.add(medal);
	}
	
	public void WyswietlMedale()
	{
		System.out.println("Uzyskane medale"+List); 
	}
	
	
	

}
