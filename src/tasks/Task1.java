package tasks;

public class Task1 {
//	Check the number is less than or greater than 
//	num<=100
//	    print less than 100
//	    num>=50
//	       print greater than 50
//
//	      print less than 50
//
//	print greater than 100
	public static void main(String args[]) {
		int num =20;
		 if (num <= 100) {
			 System.out.println(num+" is less than 100");
	            if (num >= 50) {
	                System.out.println("Greater than 50");
	            } else {
	                System.out.println(num+ " Less than 50");
	            }
	        } else {
	            System.out.println(num+" Greater than 100");
	        }
		
	}

}

