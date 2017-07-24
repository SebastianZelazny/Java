package czas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Duration_IsTime {

	public static void main(String[] args) {
		
		Instant t1 = Instant.now();
		for(int i =0; i<1000;i++)
		{
			System.out.println("Mierzenie czasu");
		}
		Instant t2 = Instant.now();
		
		Duration d = Duration.between(t1, t2);
		
		System.out.println(d.getNano());
		
		LocalTime lt = LocalTime.now();
		for(int i =0; i<10;i++)
		{
			lt = lt.plusSeconds(1);
			
		}
	}

}
