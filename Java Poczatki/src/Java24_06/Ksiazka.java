package Java24_06;

public class Ksiazka {
	
	public static String ISBN;
	public static String Autor;
	public static String Tytul;
	public static boolean wyporzyczona;
	
	public Ksiazka(String Tytul,String Autor,String ISBN,boolean wyporzyczona){
		this.Tytul = Tytul;
		this.Autor = Autor;
		this.ISBN = ISBN;
		this.wyporzyczona = wyporzyczona;
	}
	
	
	
	public static void wyporzycz()
	{
		wyporzyczona=true;
	}
	public static void oddaj()
	{
		wyporzyczona=false;
	}
	
	public static void Inforamcje()
	{
		System.out.println("Tytul: "+Tytul);
		System.out.println("Autor: "+Autor);
		System.out.println("ISBN: "+ISBN);
		System.out.println("wyporzyczona: "+wyporzyczona);
	}
	
	public static boolean CzyWyporzyczona()
	{
		return wyporzyczona;
	}
	
	public static void main(String[] args) {
		Ksiazka k1 = new Ksiazka("Ala ma kota", "ALA", "ISBN123aasd", false);
		
		k1.Inforamcje();
		k1.wyporzycz();
		k1.Inforamcje();
		k1.oddaj();
		k1.Inforamcje();
		
	}
	
}
