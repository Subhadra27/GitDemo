package datatypes;

public class ConcatStringChar {
	
	public static String concatStringChar(String str,char ch) {
		String result;
		result=str+ch;
		
		return result;
		
	}

	public static void main(String[] args) {
		String str_input="Hello Selenium";
		char ch_input='t';
		System.out.println(concatStringChar(str_input,ch_input));

	}

}
