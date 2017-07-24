package Java24_06;

import java.util.Random;

public class sample {

	public static void main(String[] args) {
		/*double [] nums = {1,2,3,4,5};
		for (double d : nums) System.out.println(d);

		//Tablice 2 wymiarowe
		
		int tab [] [] = new int [3][3];
		
		int tab2 [] [] [] = new int [3][3][3];
		
		Random generator = new Random();
		int los = generator.nextInt(50);
		System.out.println(los);
		*/
		
		
/*		// Zad 1
		Random generator1 = new Random();
		int tab1 []= new int[10];
		
		for (int i = 0; i<tab1.length; i++)
		{
			
			tab1[i]=generator1.nextInt(20);
			
		
			
		}
		System.out.println("parzysta");
		for(int i = 0; i <tab1.length;i++)
		{
			if(tab1[i]%2==0)
			{
				
				System.out.println("Liczba "+i +" jest równa "+tab1[i]);
			}
			
		}
		System.out.println("Nieparzysta");
		for(int i = 0; i <tab1.length;i++)
		{
			if(tab1[i]%2!=0)
			{
				
				System.out.println("Liczba "+i +" jest równa "+tab1[i]);
			}
			
			
		}
		
		String a="o";
		
		for (int i =0; i<5;i++)
		{
			
			for(int j =1 ; j<=i ; j++)
			{
				System.out.print(a);
			}
			System.out.println(a);
		}*/
		
		int tab3[] = new int[10];
		int tab2[] = new int[10];
		
		for (int i = 0; i <10;i++)
		{
			System.out.println(tab2);
			tab3[i] = i;
			for(int j =1; j<i;i++)
			{
				tab2[j]=i*2;
			}
		}
		
		for (int i : tab2) {
			System.out.println(tab2);
			
		}
		
		for (int i : tab3) {
			System.out.println(tab3);
		}
		
		
		
		
	}

}
