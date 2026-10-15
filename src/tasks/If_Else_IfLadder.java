package tasks;

public class If_Else_IfLadder {
	public static void main(String args[]) {
		String browser ="chrome";
		if(browser == "edge") {
			System.out.println("Edge browser");
		}
		else if(browser == "safari") {
			System.out.println("safari browser");
		}
		else if(browser == "chrome") {
			System.out.println("chrome browser");
			
		}//comment chrome to print invalid(working else part)
		else if(browser == "edge") {
			System.out.println("edge browser"); 
		}
		else {
			System.out.println("Invalid browser");
		}
		
	}

}
