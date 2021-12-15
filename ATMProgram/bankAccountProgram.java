package constructors;

public class bankAccountProgram {

	public static void main(String[] args) {
		bankAcountClass bobsAccount = new bankAcountClass("12345", 00.0, "Bob Williams", "myemail@gmail.com", "98573496854");
		System.out.println(bobsAccount.getPhoneNumber());
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.setNumber("12345");
		bobsAccount.setBalance(00.0);
		bobsAccount.setCustomerName("Bob Williams");
		bobsAccount.setCustomerEmailAddress("myemail@gmail.com");
		bobsAccount.setPhoneNumber("91774589735");
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(10.0);
		bobsAccount.deposit(50.0);
		bobsAccount.deposit(50.0);

	}

}
