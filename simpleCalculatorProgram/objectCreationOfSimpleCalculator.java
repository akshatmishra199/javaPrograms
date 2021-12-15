package ATMProgram;

public class objectCreationOfSimpleCalculator {

	public static void main(String[] args) {
		
		simpleCalculator calculator = new simpleCalculator(); //Creating object of class simpleCalculator
		
		calculator.setFirstNumber(5.0); //set the value of first number
		calculator.setSecondNumber(4); //set the value of second number
		
		System.out.println("add " + calculator.getAdditionResult()); //print the addition result value using get method
		System.out.println("Subtract " + calculator.getSubtractionResult()); //print the subtraction result value using get method
		
		simpleCalculator calc = new simpleCalculator(); //creating another object for class simpleCalculator
		
		calc.setFirstNumber(5.25);
		calc.setSecondNumber(0);
		
		System.out.println("multiplication " + calc.getMultiplicationResult());
		System.out.println("Division " + calc.getDivisionResult());
		

	}

}
