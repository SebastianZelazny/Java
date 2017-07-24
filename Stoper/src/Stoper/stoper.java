package Stoper;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
import java.lang.Math;
public class stoper {

	public static void main(String[] args) {
		
		
		Scanner user_input = new Scanner(System.in);
		String zm = "";
		System.out.println("Naciœnij Enter by zaczac odliczac czas: ");
		zm = user_input.nextLine(); 
		LocalTime time1 = LocalTime.now();
		System.out.println("Naciœnij Enter by zakonczyc odliczac czas: ");
		zm = user_input.nextLine();
		LocalTime time2 = LocalTime.now();
		Duration dur = Duration.between(time1, time2);
		
		System.out.println("Czas: "+dur.getSeconds()+" Milisekund: "+Math.round(dur.getNano()*Math.pow(10, -9))); 
		
	}

}
