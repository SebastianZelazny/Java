package Java_01_07;

public class KontoBankowe2 extends Konto_bankowe{

	public KontoBankowe2(String nrKonta, Integer saldo) {
		super(nrKonta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interest() {
		addSaldo(getSaldo()*0.10);
	}

	@Override
	public void addDebit(double debit) {
		if(getSaldo()>=1000)
		{
			setMaxDebi(getMaxDebi()+debit);
		}
		else
		{
			System.out.println("Masz za ma³o na koncie");
		}
		
	}
	
}
