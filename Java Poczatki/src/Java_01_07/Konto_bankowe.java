package Java_01_07;

import java.util.Scanner;

public abstract class Konto_bankowe {
	
	private String nrKonta;
	private double saldo;
	private double maxDebi;
	
	Scanner User_input = new Scanner(System.in);
		
	protected Konto_bankowe(String nrKonta, int saldo)
	{
		
		this.nrKonta=nrKonta;
		this.saldo=saldo;
	}
	protected Konto_bankowe(String nrKonta, double saldo)
	{
		
		this.nrKonta=nrKonta;
		this.saldo=saldo;
	}
	
	
	public String getNrKonta() {
		return nrKonta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void addSaldo(double dodajKwote)
	{
		saldo=saldo+dodajKwote;
	}
	public void addSaldo(int dodajKwote)
	{
		saldo=saldo+dodajKwote;
	}
	public void subbSaldo(double wydatek)
	{
		saldo=saldo-wydatek;
	}
	public void subbSaldo(int wydatek)
	{
		saldo=saldo-wydatek;
	}
	
	public abstract void interest();
	public abstract void addDebit(double debit);


	public double getMaxDebi() {
		return maxDebi;
	}

	public void setMaxDebi(double maxDebi) {
		this.maxDebi = maxDebi;
	}
}
