package model;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Employee() {}
	
}
