package Lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class listaLtes {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		/*String decyzja ="t";
		ArrayList<String> lista = new ArrayList<>();
		while(decyzja.equals("t"))
		{
			System.out.println("Podaj wyraz: ");
			String wyraz = user_input.nextLine();
			lista.add(wyraz);
			
			System.out.println("Czy chcesz prowadzac dalej (t/n))?");
			decyzja = user_input.nextLine();
			
		}

		
		for(int i =0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
		}
		*/
		String Mleko = "3.45";
		String Jajka = "4.15";
		String chleb = "2";
		String cukie = "1.99";
		String pomidory = "5.70";
		String woda = "0.69";
		String pomarancze = "9.60";
		String ser = "15.55";
		
		Map<String, Double> produkty = new HashMap<>();
		produkty.put("mleko", 3.45);
		produkty.put("jajka", 4.15);
		produkty.put("chleb", 2.0);
		produkty.put("cukier", 1.99);
		produkty.put("pomidory", 5.70);
		produkty.put("woda", 0.69);	
		produkty.put("pomarancze", 9.60);
		produkty.put("ser", 15.55);
	
		Map<String, Integer> koszyk = new HashMap<>();
		int licznik = 1;
		double rachunek =0;
		String decyzja="";
		String decyzja1="";
/*		while(!decyzja.equals("koniec"))
		{
			System.out.println(" Wybierz produkty z pu³ki: Mleko,jajka,Chleb,M¹ka,Cukier,Bu³ki,Pomidory,Woda,Pomarañcze,Ser");
			System.out.print(" Wybor: ");
			decyzja = user_input.nextLine();
			if(decyzja.equals("mleko"))
			{
				rachunek +=Double.parseDouble(Mleko);
			}
			else if(decyzja.equals("jajka"))
			{
				rachunek +=Double.parseDouble(Jajka);
			}
			else if(decyzja.equals("chleb"))
			{
				rachunek +=Double.parseDouble(chleb);
			}
			else if(decyzja.equals("cukie"))
			{
				rachunek +=Double.parseDouble(cukie);
			}
			else if(decyzja.equals("pomidory"))
			{
				rachunek +=Double.parseDouble(pomidory);
			}
			else if(decyzja.equals("woda"))
			{
				rachunek +=Double.parseDouble(woda);
			}
			else if(decyzja.equals("pomarancze"))
			{
				rachunek +=Double.parseDouble(pomarancze);
			}
			else if(decyzja.equals("ser"))
			{
				rachunek +=Double.parseDouble(ser);
			}
			
		}*/
		ArrayList<String> lista1 = new ArrayList<>();
		while(!decyzja.equals("koniec"))
		{
			
			System.out.println(" Wybierz produkty z pu³ki: Mleko,jajka,Chleb,M¹ka,Cukier,Bu³ki,Pomidory,Woda,Pomarañcze,Ser");
			System.out.print(" Wybor: ");
			decyzja = user_input.nextLine();
			if(produkty.containsKey(decyzja))
			{
				rachunek+=produkty.get(decyzja);
				if(koszyk.containsKey(decyzja))
				{
					System.out.print(" Czy chcesz dodaj jeszcze jeden produkt t/n: ");
					decyzja1 = user_input.nextLine();
					if(decyzja1.equals("t"))
					{
						licznik++;
						koszyk.put(decyzja,licznik );
					}
				}
				else
				{
					koszyk.put(decyzja,licznik );
				}
				lista1.add(decyzja+","+produkty.get(decyzja));
			}
		}
		for(int i =0;i<lista1.size();i++)
		{
			System.out.println(lista1.get(i)) ;
		}
		
		System.out.println("Laczyny rachunek: ");
		System.out.println(rachunek);
		
		
	}
}
