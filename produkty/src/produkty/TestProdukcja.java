package produkty;

import java.awt.List;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProdukcja {

	public static void main(String[] args) {
		ArrayList<produkt> lista_pr= new ArrayList<>();
		
		Scanner rl = new Scanner(new FilterInputStream(System.in)
		{
			@Override
			public void close()
			{
					
			}
		});
		while(true)
		{
			System.out.println("Podaj nazwe produktu lub zakoncz (end): ");
			String nazwa_pro = rl.nextLine();
			if(nazwa_pro.toLowerCase().equals("end"))
				break;
			produkt pr = new produkt(nazwa_pro);
			lista_pr.add(pr);
		}
		
		//System.out.println("Data produkcji: "+p1.getData_produkcji()+" data zuzycia:"+p1.getData_uzycia());

		for(produkt s : lista_pr)
		{
			System.out.println("Nazwa produktu: "+s.getNazwa_produktu()+" Data produkcji: "+s.getData_produkcji()+" Data zuzycia:"+s.getData_uzycia());
		}
		
	}
}
