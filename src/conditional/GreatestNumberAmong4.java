/*
 * Find out the greatest number out of four different given numbers:
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Input the 4th number: 97
 */
package conditional;

public class GreatestNumberAmong4 {
	
	public static byte greatestNumber(byte num1,byte num2,byte num3,byte num4){
		if(num1>num2&&num1>num3&&num1>num4) {
			return num1;
		}
		else if(num2>num3&&num2>num4) {
			return num2;			
		}
		else if(num3>num4) {
			return num3;			
		}
		else {
			return num4;
		}
	}

	public static void main(String[] args) {
		byte input1,input2,input3,input4;
		input1=25;
		input2=78;
		input3=87;
		input4=97;
		System.out.println("The greatest num is "+ greatestNumber(input1,input2,input3,input4));
		System.out.println("print the correct number");

	}

}
