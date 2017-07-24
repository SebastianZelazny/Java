package Java24_06;

public class Liczba {

	public static int a;


	public Liczba(int a)
	{
		this.a=a;
	}

	public static void parzysta()
	{
		if(a%2==0)
		{
			System.out.println("Parzysta");
		}
	}
	public static void NieParzysta()
	{
		if(a%2!=0)
		{
			System.out.println("nieParzysta");
		}
	}
	public static void mniejsze()
	{
		int i =a;
		while(i!=0)
		{
			System.out.println(i);
			i--;
		}
	}
	public static void wktorejsetce()
	{
		if(a<101)
		{
			System.out.println("W 0 setce");
		}
		else if(a>=101 && a<201)
		{
			System.out.println("W 1 setce");
		}
		else if(a>=201 && a<301)
		{
			System.out.println("W 2 setce");
		}
		else if(a>=301 && a<401)
		{
			System.out.println("W 3 setce");
		}
		else if(a>=401 && a<501)
		{
			System.out.println("W 4 setce");
		}
		else if(a>=501 && a<201)
		{
			System.out.println("W 5 setce");
		}
		else if(a>=601 && a<701)
		{
			System.out.println("W 6 setce");
		}
		else if(a>=701 && a<801)
		{
			System.out.println("W 7 setce");
		}
		else if(a>=801 && a<901)
		{
			System.out.println("W 8 setce");
		}
		else if(a>=901 && a<1001)
		{
			System.out.println("W 9 setce");
		}
		
	}
	public static void czywieksza100()
	{
		if(a>100)
		{
			System.out.println("Liczba wieksza od 100");
		}
	}
	
	public static void czyPierwsza()
	{
		int licznik=0;
		int i=a;
		while(i!=0)
		{
			if(a%i==0)
			{
				licznik++;
				if(licznik<=2)
				{
					System.out.println("Liczba pierwsza ");
				}
				else
				{
					System.out.println("Liczba niepierwsza ");
				}
			}
			i--;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Liczba l1 = new Liczba(3);
		l1.mniejsze();
		l1.wktorejsetce();
		l1.NieParzysta();
		l1.parzysta();
		l1.czyPierwsza();

	}

}
