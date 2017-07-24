package model;

public class TableModel {
	private int id;
	private String FirstName;
	private String LastName;
	private String Salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public TableModel(int id,String FirstName,String LastName,String Salary)
	{
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Salary = Salary;
	}
}
