package datatypes;
public class SquareOfFloat {	
	public static float squareFloat(float num1) {
		float res= num1*num1;
		return res;	
	}
	public static void main(String[] args) {
		float input1= 3.9f;
		System.out.println(squareFloat(input1));
	}

}
