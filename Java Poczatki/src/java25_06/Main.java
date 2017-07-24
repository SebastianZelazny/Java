package java25_06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Output_user = new Scanner(System.in);
	/*	Uczen u1 = new Uczen("Adam", "Malysz", "Maly");
		Uczen u2 = new Uczen("Tomek", "Nowik");

		u2.PrzedstawSie(false);
		u1.PrzedstawSie(true);
		
		Kalkulator kalk1 = new Kalkulator();
		
		System.out.println("Dodawanie: "+kalk1.dodawanie(34, 22));
		System.out.println("Odejmowanie: "+kalk1.odejmowanie(34, 22));
		System.out.println("Mnozenie: "+kalk1.mnozenie(34, 22));
		System.out.println("Dzielenie: "+kalk1.dzielenie(21.1, 222));
		System.out.println("Modulo: "+kalk1.modulo(34, 22));*/
		
	/*	System.out.print("Podaj wiadomosc: ");
		String wiad = Output_user.next();
		
		System.out.print("Podaj przesuniecie: ");
		int przesun = Output_user.nextInt();
		
		Szyfr NowySzyfr = new Szyfr(wiad);
		
		NowySzyfr.Szyfruj();
		NowySzyfr.OdSzyfruj();*/
		
		
		/*Animal zwierze = new Animal("Zenek", "Kot");
		
		zwierze.WydajGlos();
	*/
		
		
	/*	Samochod BMW = new Samochod("E46", "BMW", 120000);
		Samochod Audi = new Samochod("A6", "Audi", 130000);	
		Samochod Fiat = new Samochod("Punto", "Fiat", 30000);
		
		double srednia_ce = (BMW.getCena() + Audi.getCena()+Fiat.getCena())/3;
		
		Samochod.srednia_cena=srednia_ce;
		
		System.out.println(Samochod.srednia_cena);*/
		
	/*	student student1 = new student();
		
		student1.setImie("Jarek");
		student1.setNazwisko("Marek");
		student1.setZyje(true);
		student1.setOcena(4);
		
		
		System.out.println(student1.getImie());
		System.out.println(student1.getNazwisko());
		System.out.println(student1.isZyje());
		System.out.println(student1.getOcena());
		student1.rusz_reka();*/
		
/*		kot kot1 = new kot();
		kot1.setKolor("Czarny");
		kot1.setImie("Mruczek");
		
		
		pies pies1 = new pies();
		
		pies1.setKolor("Trikolor");
		pies1.setImie("Szczekacz");
		
		
		
		zwierze zwierze1= new zwierze();
		
		
		
		System.out.println(kot1.getImie());
		System.out.println(kot1.getKolor());
		kot1.dzwiek();
		
		System.out.println();
		
		System.out.println(pies1.getImie());
		System.out.println(pies1.getKolor());
		pies1.dzwiek();
		
		System.out.println();
		zwierze1.dzwiek();*/
		
		
		Trojkat trojkat1= new Trojkat(10,5,15);
		
		kwadrat kwadrat1 = new kwadrat(10);
		
		prostokat prostokat1 = new prostokat(10, 15);
		
		
		System.out.println("Trojkat");
		System.out.println("");
		System.out.println("Pole");
		trojkat1.pole();
		System.out.println("Obwod");
		trojkat1.obwod();
		System.out.println("");
		System.out.println("Kwadrat");
		System.out.println("");
		System.out.println("Pole");
		kwadrat1.pole();
		System.out.println("Obwod");
		kwadrat1.obwod();
		System.out.println("");
		System.out.println("Prostokat");
		System.out.println("");
		System.out.println("Pole");
		prostokat1.pole();
		System.out.println("Obwod");
		prostokat1.obwod();
		
		
		
	}
}

