package operators;

public class Q2IncrementDecrement {

	public static void main(String[] args) {
		
			int a=11, b=22, c;
			
			c = a + b + a++ + b++ + ++a + ++b;
			
			System.out.println("a="+a);//a=13
			System.out.println("b="+b);//b=24
			System.out.println("c="+c);//c=103
		

	}

}
