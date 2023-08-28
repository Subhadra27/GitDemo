package datatypes;
/*
 * * String a = “Hello“;
String b = “Naveen K“
Expected Output :
Hello Naveen K
 */
public class AddTwoStrings {
	
	public static String concatStrings(String a,String b) {
		String res;
		res=a+" "+b;		
		return res;		
	}
	public static void main(String[] args) {
		String str1="Hello";
		String str2="Naveen K";		
		System.out.println(concatStrings(str1,str2));
		
	}

}
