package Eception_handling;

public class NegativeValueException extends Exception {
	public NegativeValueException() {
		super();
		System.out.println("NegativeValuesException occured");
	}
}
