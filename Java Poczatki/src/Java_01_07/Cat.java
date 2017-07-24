package Java_01_07;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void giveSound()
	{
		System.out.println("Jestem kotem i nazywam siê "+getName());
	}
	

}
