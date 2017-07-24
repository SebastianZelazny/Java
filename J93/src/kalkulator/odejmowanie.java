package kalkulator;

public class odejmowanie {

	private double a;
	private double b;

	public odejmowanie(double a, double b ) {
		this.a=a;
		this.b=b;
	}
	public odejmowanie(int a, int b ) {
		this.a=a;
		this.b=b;
	}
	public odejmowanie(int a, double b ) {
		this.a=a;
		this.b=b;
	}
	public odejmowanie(double a, int b ) {
		this.a=a;
		this.b=b;
	}
	
	public double odejmo(double a, double b)
	{
		return a-b;
	}
	public int odejmo(int a, int b)
	{
		return a-b;
	}
	public double odejmo(int a, double b)
	{
		return a-b;
	}
	public double odejmo(double a, int b)
	{
		return a-b;
	}
}
