package conditional;

public class ErrorSwitchCase {

	public static void main(String[] args) {
		{
	        int x = 2;
	        int y = 1;
	        switch (x) {
	        case 1:
	            System.out.println(1);
	            break;
	        case 2:
	            System.out.println(2);
	            break;
	        case x + y:  //case expression must be constant
	            System.out.println(3);
	            break;
	        default:
	            System.out.println("Default");
	        }
		}		
	}
}


