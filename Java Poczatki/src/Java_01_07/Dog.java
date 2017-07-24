package Java_01_07;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void giveSound()
	{
		System.out.println("Jestem psem i nazywam siê "+getName());
	}
}
