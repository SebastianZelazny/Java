package warunkowe;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		Scanner User_Input	= new Scanner(System.in);
		int tab [] = {1,2,3,4,5,6};
		int sizeTab = 0;
		
		System.out.println("Podaj wielkoœæ tablicy: ");
		try
		{
			sizeTab = User_Input.nextInt();
			System.out.println(tab[sizeTab]);
		}
		catch (InputMismatchException e) {
			System.out.println("Podano nieprawid³owy znak");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Podano nieprawid³owy indeks");
		}
	}
}
