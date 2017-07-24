package obslugaWyjatkow;

import java.util.Scanner;

public class J87 {

	public static void main(String[] args)
	{
		String napis=null;
		//Scanner user_input = new Scanner(System.in);
		System.out.println("Podaj jakis wyrwaz");
		//napis = user_input.nextLine();
		try
		{
			System.out.println(napis.length());
		}
		catch (NullPointerException e) {
			System.out.println("Null Exception");
		}
		
	}
}
