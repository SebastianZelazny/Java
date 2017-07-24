package java25_06;

public class Auto {
	
	
	
	public static int dodaj (int a, int b)
	{
		return a + b;
	}
	
	public static double dodaj(double a, double b)
	{
		return a + b;
	}
	
	
	int year; String brand; String model; String color;
	
	Auto(int year, String brand, String model , String color)
	{
		this(year, brand,model);
		this.color = color;
	}
	
	Auto(int year, String brand, String model)
	{
		this.year = year;
		this.brand = brand;
		this.model = model;
	}
	void ShowInfomraions() 
	{
		System.out.println(year + brand + model +color);
	}
	
	public static void main(String[] args) {
		System.out.println(dodaj(3, 3));
	}

	
}
