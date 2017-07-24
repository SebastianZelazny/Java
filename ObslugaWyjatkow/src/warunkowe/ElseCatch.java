package warunkowe;

import java.util.Scanner;

public class ElseCatch {

	public static void main(String[] args) {
		Scanner User_Input	= new Scanner(System.in);
		int tab [] = {1,2,3,4,5,6};
		int sizeTab = 0;
		
		System.out.println("Podaj wielkoœæ tablicy: ");
		
		sizeTab = User_Input.nextInt();
		if(sizeTab>=0 && sizeTab<tab.length)
		{
			System.out.println(tab[sizeTab]);
		}
		else
		{
			System.out.println("Podano niprawid³owa wartoœæ indexu");
		}

	}

}
