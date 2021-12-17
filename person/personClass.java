package person;

public class personClass {
	
	//Creating three field variables first and last name and age
	private String firstName;
	private String lastName;
	private int age;
	
	//Set the values of first name, last name and age using setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// Create the getter method to print the first name, last name and age of a person
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	//Create get age method and checking if age is less than 0 and greater than 100, then print invalid age value
	public int getAge() {
		if(this.age<0 && this.age>100) {
			System.out.println("Invalid age value");
			return 0;
		}else
			return this.age;
	}
	
	//Creating method to check if a person is teen 
	public boolean getIsTeen() {
		if(this.age>12 && this.age<20) {
			System.out.println("It's a teen");
			return true;
		}else {
			System.out.println("Not a teen");
			return false;
	}
	}
	
	public String getFullname() {
		String fullName = "";
		if(!this.firstName.equals("") && !this.lastName.equals("")) {
			fullName = "";
		}
		return (this.firstName + fullName + this.lastName);
	}

}
