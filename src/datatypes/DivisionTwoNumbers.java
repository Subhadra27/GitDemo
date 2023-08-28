package datatypes;

public class DivisionTwoNumbers {
	
	public static int divisionTwoNumbers(byte num1,byte num2) {
		int res;
		res=num1/num2;
		return res;	
	}
	public static void main(String[] args) {
		byte input1=50;
		byte input2=3;
		System.out.println(divisionTwoNumbers(input1,input2));
	}

}
