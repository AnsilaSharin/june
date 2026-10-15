package controlstatements;

public class Nested_Statements {
	public static void main(String args[]) {
		int num = -25;
		if(num>0) {
			System.out.println(num+ " is positive and even number");
		
			if(num%2==0) {
				System.out.println(num+" is positive and odd number");
			}
			else {
				System.out.println(num+"is negative number");
			}
		}
		
		else {
			if(num%2==0) {
				System.out.println(num+" is negative and Even number");
			}
			else {
				System.out.println(num+" is negative and odd number");
			}
		}
	}

}
