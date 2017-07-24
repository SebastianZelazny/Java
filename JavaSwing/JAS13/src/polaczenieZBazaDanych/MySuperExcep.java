package polaczenieZBazaDanych;

public class MySuperExcep extends Exception
{
	public void cosSieStalo()
	{
		
		System.out.println("Nie ma obiektu");
		printStackTrace();
	}
}
