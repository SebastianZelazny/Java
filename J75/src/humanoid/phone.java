package humanoid;

public interface phone {
	public void dzwoni();
	public void rozmawia();
	public void koniec();
	public void pytanie();
	public void odpowiedz();
	default public void sendSms() 
	{
		
	}
	default public void getSms()
	{
		
	}
}
