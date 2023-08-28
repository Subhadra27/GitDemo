package datatypes;

public class SumTwoNumbers {
	
	public static int sumTwoNumbers(byte num1,byte num2) {
		/*
		 * In Java, when we perform arithmetic operations on byte data types, they are
		 * automatically converted to int . 
		 * thats why the result of num1 + num2 will be an int
		 */
		int result ;
		result = num1 + num2;		
		return result;		
	}

	public static void main(String[] args) {
		
		byte input1= 74;
		byte input2=36;


		sumTwoNumbers(input1,input2);

	}

}
