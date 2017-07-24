package humanoid;

public class Main {

	public static void main(String[] args) {
		
		Humanoid reg1 = new regular("Tomek", 140, 21, true, true);
		
		Humanoid reg2 = new regular("Ala", 150, 22, false, true);
		
		if(reg1 instanceof regular && reg2 instanceof regular)
		{
			reg1.interakcja(reg2);
		}

	}

}
