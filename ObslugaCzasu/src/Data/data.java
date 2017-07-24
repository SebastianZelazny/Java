package Data;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class data {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate firstJan2014 = LocalDate.of(2018, 1,1);
		boolean check = now.isAfter(firstJan2014);
		System.out.println("Czy dzisja jest pi 1.1.2014: "+check);
		Period p = Period.between(now, firstJan2014);
		
		System.out.println(p.getMonths());
		
		Scanner user_input = new Scanner(System.in);	
		String year = "";
		String month = "";
		String day = "";
		String urodziny;
		System.out.println("Podaj date urodzin yyyy-mm-dd: ");
		urodziny = user_input.nextLine();
		
		
		for(int i =0; i<urodziny.length();i++)
		{
			char character = urodziny.charAt(i);
			if(i<=3)
			{
				year += character;
				
			}
			else if(i>=5 && i<=6)
			{
				month += character;
			}
			else if(i>=8)
			{
				day +=character;
			}
		}
		
		
		
		/*System.out.println(year);
		System.out.println(month);
		System.out.println(day);*/
		
		LocalDate urodziny1 = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		
		System.out.println(urodziny1.getDayOfWeek()); 
		
		LocalDate tempDate = urodziny1;
		for(int i = urodziny1.getYear();i<now.getYear();i++)
		{
			tempDate = tempDate.plusYears(1);
			if(tempDate.getDayOfWeek().equals(urodziny1.getDayOfWeek()))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
