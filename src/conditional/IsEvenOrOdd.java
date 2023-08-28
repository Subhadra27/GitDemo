package conditional;

public class IsEvenOrOdd {
	
	public static void isEvenOdd(byte num) {
		
		if(num%2==0) {
			System.out.println("The number is an even number");
			
			
		}else {
			System.out.println("The number is a odd number");
			
		}
		
	}

	public static void main(String[] args) {
		
		byte input1 = 20;
		byte input2 = 31;
		
		isEvenOdd(input1);
		isEvenOdd(input2);
		
		

	}

}
