
public class Person {

	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	@Override
	public String toString() {
		return String.format("%s, %s", this.lastName, this.firstName);
	}
}
