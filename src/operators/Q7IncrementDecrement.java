package operators;

public class Q7IncrementDecrement {

	public static void main(String[] args) {
		int i=19, j=29, k;
		int m = i-- - j-- - k--;//Compile time error,the local variable k may not have been initialized
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);

	}

}
