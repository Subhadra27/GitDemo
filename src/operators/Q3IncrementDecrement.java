package operators;

public class Q3IncrementDecrement {

	public static void main(String[] args) {
		int i=0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);//output =0
	}

}
