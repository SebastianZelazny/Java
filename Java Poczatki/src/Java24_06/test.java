package Java24_06;

import java.util.Random;
import java.util.Scanner;
public class test {
	
	
	
	public static int dodaj (int a, int b)
	{
		return a +b;
	}
	
	public static void czesc()
	{
		System.out.println("Czeœæ !");
	}
	public static void main(String[] args) {

		int suma = dodaj(5, 10);
		
		System.out.println(suma);
		
		czesc();
		
		Random gen = new Random();
		/*
		int tab2[][] = new int[11][11];
		
		for (int i = 0; i <11;i++)
		{
			
			for(int j =0; j<11;j++)
			{
				tab2[i][j]=i*j;
			}
		}
		
		System.out.println("Wynik mnozenia "+ tab2[2][3]);
		
		/*		int tab3[][] = new int[11][11];
		int sum []
		for (int i = 0;i<11;i++)
		{
			sum
		}
		*/
/*		
		int tab[] = new int [50];
		
		int max=0;
		int min=50;
		
		for (int i =0;i<tab.length;i++)
		{
			tab[i]=gen.nextInt(50);
			if(tab[i]>max)
			{
				max=tab[i];
			}
			if(tab[i]<min)
			{
				min=tab[i];
			}	
			
		}
		
		System.out.println("Min:"+min);
		
		System.out.println("Max: "+max);
		
		int leng=5;
		int tab4[] = new int [leng];
		for(int i=0;i<leng;i++)
			tab4[i]= gen.nextInt(50);
		
		
		
		int tmp=0;
		for (int i=0;i<50; i++)
		{
			for (int j=0;j<49;j++)
			{
				if(tab[j] > tab[j+1])
				{
					tmp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = tmp;
					
				}
			}
		}
		
		for (int i=0;i<50; i++) {
			System.out.println(tab[i]);
		}
		
		 Scanner user_input = new Scanner(System.in);
		
		System.out.println("Podaj liczbe:"); 
		int x = user_input.nextInt();
		int wynik =0;
		
		while(x!=0)
		{			
			wynik=wynik + (x%10);
			x=x/10;
			
		}
		
		System.out.println("Suma liczb: "+wynik); 
		
		System.out.println("Podaj zdanie do zaszyfrowania"); 
		
		String s = user_input.next();
		String n="";
		for(int i =0; i<s.length();i++)
		{
			char character = s.charAt(i);
			if((int)character==120)
			{
				character = (char)(97);
				n = n +character;
			}
			else if((int)character==121)
			{
				character = (char)(98);
				n = n +character;
			}
			else if((int)character==122)
			{
				character = (char)(99);
				n = n +character;
			}
			else
			{
				character = (char)(character +3);
				n = n +character;
			}
		}
		
		System.out.println("Zdane zaszyfrowane: "+n); */
	
/*		
		int tab5[] = new int[50];
		for(int i =0; i<tab5.length;i++)
		{
			tab5[i]=gen.nextInt(100);
		}
		
		int niepelnoletni=0;
		int pelnoletni =0;
		int dziecko =0;
		int emeryt=0;
		int szkolne=0;
		
		for(int i =0; i<tab5.length;i++)
		{
			if(tab5[i]<=1)
			{
				dziecko++;
				niepelnoletni++;
			}
			else if(tab5[i]>=2 && tab5[i]<=6)
			{
				niepelnoletni++;
			}
			else if (tab5[i]>=7 && tab5[i]<=19)
			{
				szkolne++;
				niepelnoletni++;
			}
			else if (tab5[i]>=20 && tab5[i]<=67)
			{
				pelnoletni++;
			}
			else if (tab5[i]>=68)
			{
				pelnoletni++;
				emeryt++;
			}
			
		}
		
		System.out.println("Liczba niemowlat: "+dziecko);
		System.out.println("Liczba w wieku szkolnym: "+szkolne);
		System.out.println("Liczba Emerytow: "+emeryt);
		System.out.println("Liczba Pelnoletnich: "+pelnoletni);
		System.out.println("Liczba niepelnoletnicj: "+niepelnoletni);
		*/
		
		
		
	
		
		
	}
	
}
