package datatypes;
public class VIMP_AddThreeNumbers {
	
	public static void addThreeNumbers(short num1,short num2,short num3) {
		int res;
		res=num1+num2+num3;		
		//Print the raw string
		System.out.println("\"Your total amount is." + res + "\"");
	}

	public static void main(String[] args) {
		short input1=100;
		short input2=200;
		short input3=3400;		
		addThreeNumbers(input1,input2,input3);
	}

}
