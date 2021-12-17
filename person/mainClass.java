package person;

public class mainClass {

	public static void main(String[] args) {
		personClass person = new personClass();
		 person.setFirstName("");
		 person.setLastName("");
		 person.setAge(10);
		 
		 System.out.println("Full Name " + person.getFullname());
		 System.out.println("Age " + person.getIsTeen());
		 
		 person.setFirstName("Akki");
		 person.setAge(20);
		 
		 System.out.println("Full name " + person.getFullname());
		 System.out.println("Age " + person.getIsTeen());
		 
		 person.setLastName("Mishra");
		 person.setFirstName("");
		 person.setAge(18);
		 
		 System.out.println("Full name " + person.getFullname());
		 System.out.println("Age " + person.getAge());

	}

}
