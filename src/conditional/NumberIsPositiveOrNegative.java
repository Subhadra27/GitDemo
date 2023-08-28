package conditional;

public class NumberIsPositiveOrNegative {
	
	public static boolean positiveOrNegative(byte num) {		
		boolean isPositive ;		
		if(num>0) {
			isPositive = true;
		}else if(num<0){
			isPositive = false;
		}else {
			isPositive = false; 
			
		}
		 return isPositive ;
	}

	public static void main(String[] args) {
		byte input1 = 35;
		byte input2 = -11;
		System.out.println("The enter number is postive number ?" +positiveOrNegative(input1) );
		System.out.println("The enter number is postive number ?" +positiveOrNegative(input2) );
		

	}

}
