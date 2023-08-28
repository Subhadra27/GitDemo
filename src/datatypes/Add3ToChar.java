/*
 * Write a program to add 3 to the ASCII value of the character 'd' 
 * and print the equivalent character.
 */
package datatypes;
public class Add3ToChar {	
	public static char addThreeToAscii(int input) {
		int resAscii;
		resAscii= input+3;
		char resChar= (char)(resAscii);
		return resChar;		
	}
	public static void main(String[] args) {
		int ch='d';
		System.out.println(addThreeToAscii(ch)); 
	}
}
