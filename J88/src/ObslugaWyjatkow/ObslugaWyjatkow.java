package ObslugaWyjatkow;

import java.util.Random;
import java.util.Scanner;

public class ObslugaWyjatkow  {
	
	private class MyExcB extends Exception{}
	private class MyExcC extends Exception{}
	
	void loswyj() throws MyExcA,MyExcB,MyExcC
	{
		Random ran = new Random();
		switch (ran.nextInt(3))
		{
			 case 0:
			 {
				 throw new MyExcA();
			 }
			 case 1:
			 {
				 throw new MyExcB();
			 }
			 case 2:
			 {
				 throw new MyExcC();
			 }
		}
	}
	
	
	public static void main(String[] args) /*throws ArithmeticException*/ {
/*		
		Scanner user_input = new Scanner(System.in);
		
		double wynik;
		int a ,b;
		
		System.out.println("Podaj wartosc a: ");
		a = user_input.nextInt();
		System.out.println("Podaj wartosc b: ");
		b = user_input.nextInt();
		
		if(b==0)
		{
			throw new ArithmeticException("Nie mo¿na dzielic przez 0");
		}
		if(a==b)
		{
			throw new ArithmeticException("Nie mozn¹ dzielic przez samo siebie");
		}*/
		
		ObslugaWyjatkow ow = new ObslugaWyjatkow();
		
		try
		{
			ow.loswyj();
		}
		catch (MyExcA e) {
			System.out.println(e.getClass());
		}
		catch (MyExcB e) {
			System.out.println(e.getClass());
		}
		catch (MyExcC e) {
			System.out.println(e.getClass());
		}

	}

}
