package kalkulator;

public class mnozenie {
	private double a;
	private double b;

	public mnozenie(double a, double b ) {
		this.a=a;
		this.b=b;
	}
	public mnozenie(int a, int b ) {
		this.a=a;
		this.b=b;
	}
	public mnozenie(int a, double b ) {
		this.a=a;
		this.b=b;
	}
	public mnozenie(double a, int b ) {
		this.a=a;
		this.b=b;
	}
	
	public double mnoze(double a, double b)
	{
		return a*b;
	}
	public int mnoze(int a, int b)
	{
		return a*b;
	}
	public double mnoze(int a, double b)
	{
		return a*b;
	}
	public double mnoze(double a, int b)
	{
		return a*b;
	}

}
