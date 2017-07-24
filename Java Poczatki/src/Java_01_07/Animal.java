package Java_01_07;

public class Animal {

	private String name;

	public Animal(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void giveSound()
	{
		System.out.println("Jestem zwierzakiem i nazywam siê "+getName());
	}
	
}
