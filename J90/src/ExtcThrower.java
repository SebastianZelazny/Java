
public class ExtcThrower {
	
	void CanThrowExc() throws Exception
	{
		if(new java.util.Random().nextInt(5)==0)
		{
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		ExtcThrower test = new ExtcThrower();
		int i = 1;
		try
		{
			test.CanThrowExc();
			i++;
			test.CanThrowExc();
			i++;
			test.CanThrowExc();
			i++;
			test.CanThrowExc();
			i++;
			test.CanThrowExc();
			i++;
		}
		catch (Exception e) {
			e.getStackTrace();
			e.printStackTrace();
			System.out.println("wystapi³o 0"); 
			System.out.println("Wyjatek wystapil w instrukcji: "+i);
		}
		if(i==6)
		{
			System.out.println("Wyjatek nie wystapil");
		}

	}

}
