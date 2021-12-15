package constructors;

public class bankAcountClass {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String phoneNumber;
	
	//creating constructor below
	public bankAcountClass() {
		System.out.println("Empty Constructor");
	}
	
	//overloading constructor below
	public bankAcountClass(String number, double balance, String customerName, String customerEmailAddress, String phoneNumber) {
		System.out.println("Constructor with parameter called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.phoneNumber = phoneNumber;
	}

public void deposit(double depositAmount) {
	this.balance += depositAmount;
	System.out.println("The deposit is "+ depositAmount + " and new balance is "+ this.balance);
}

public void withdrawal(double withdrawAmount) {
	if(this.balance - withdrawAmount <0) {
		System.out.println("Insufficient Amount. Balance not processed");
	}else {
		this.balance -= withdrawAmount;
		System.out.println("The withdraw amount is "+withdrawAmount + " and new balance is "+this.balance);
	}
}

public void setNumber(String number) {
	this.number = number;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public void setCustomerEmailAddress(String email) {
	this.customerEmailAddress = email;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getNumber() {
	return this.number;
}
public double getBalance() {
	return this.balance;
}
public String getCustomerName() {
	return this.customerName;
}
public String getCustomerEmailAddress() {
	return this.customerEmailAddress;
}
public String getPhoneNumber() {
	return this.phoneNumber;
}
}