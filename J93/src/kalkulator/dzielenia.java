package kalkulator;

public class dzielenia {
	private double a;
	private double b;

	public dzielenia(double a, double b ) {
		this.a=a;
		this.b=b;
	}
	public dzielenia(int a, int b ) {
		this.a=a;
		this.b=b;
	}
	public dzielenia(int a, double b ) {
		this.a=a;
		this.b=b;
	}
	public dzielenia(double a, int b ) {
		this.a=a;
		this.b=b;
	}
	
	public double dziele(double a, double b)
	{
		return a/b;
	}
	public int dziele(int a, int b)
	{
		return a/b;
	}
	public double dziele(int a, double b)
	{
		return a/b;
	}
	public double dziele(double a, int b)
	{
		return a/b;
	}
}
