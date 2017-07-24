package kalkulator;



public class dodoawanie {
	private double a;
	private double b;

	public dodoawanie(double a, double b ) {
		this.a=a;
		this.b=b;
	}
	public dodoawanie(int a, int b ) {
		this.a=a;
		this.b=b;
	}
	public dodoawanie(int a, double b ) {
		this.a=a;
		this.b=b;
	}
	public dodoawanie(double a, int b ) {
		this.a=a;
		this.b=b;
	}
	
	public double doda(double a, double b)
	{
		return a+b;
	}
	public int doda(int a, int b)
	{
		return a+b;
	}
	public double doda(int a, double b)
	{
		return a+b;
	}
	public double doda(double a, int b)
	{
		return a+b;
	}
	


	
	
	
}
