package warunkowe;

import java.util.Scanner;

public class ThrowsThrow {

	public static void main(String[] args) throws ArithmeticException{
		int x=10;
		int y;
		Scanner User_input = new Scanner(System.in);
		System.out.println("Podaj wartoœæ dzielnika");
		y = User_input.nextInt();
		
		if(y==0)
		{
			throw new ArithmeticException("Nie mo¿na dzielic przez 0");
		}
		else
		{
			System.out.println(x/y);
		}
		

	}

}
