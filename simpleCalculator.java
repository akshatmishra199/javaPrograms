package ATMProgram;

//Created the simple calculator class

public class simpleCalculator {
	double firstNumber; // defined field variables
	double secondNumber;
	
	// Create the set methods for assigning values to field variables using "this" keyword
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	//Create the get methods to get the values after addition, subtraction, multiply and divide
	public double getFirstNumber() {
		return this.firstNumber;
	}
	
	public double getSecondNumber() {
		return this.secondNumber;
	}
	
	public double getAdditionResult() {
		return (this.firstNumber+this.secondNumber);
	}
	
	public double getSubtractionResult() {
		return (this.firstNumber-this.secondNumber);
	}
	
	public double getMultiplicationResult() {
		return (this.firstNumber*this.secondNumber);
	}
	
	
	//Created the get division method and first checking if denominator value is 0, if 0 it returns invalid value
	public double getDivisionResult() {
		if(this.secondNumber==0) {
			System.out.println("Invalid Value");
			return 0;
		}else
		return (this.firstNumber/this.secondNumber);
	}
}
