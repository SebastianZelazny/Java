package Java_01_07;

public class KontoBankowe1 extends Konto_bankowe{

	private KontoBankowe1(String nrKonta, Integer saldo) {
		super(nrKonta, saldo);
		// TODO Auto-generated constructor stub
	}

	private double odsetki;
	
	public static KontoBankowe1 konto (String nrKonta, Integer saldo)
	{
		if(nrKonta.length()!=13)
		{
			return null;
		}
		else
		{
			return new KontoBankowe1(nrKonta,saldo);
		}
	}
	
	@Override
	public void interest() {
		addSaldo(getSaldo()*0.03);
	}

	@Override
	public void addDebit(double debit) {
		if(getSaldo()<=0)
		{
			setMaxDebi(getMaxDebi()+debit);
		}
		
	}
	
	public double getOdsetki() {
		return odsetki;
	}

	public void setOdsetki(double odsetki) {
		this.odsetki = odsetki;
	}
	
	

}
