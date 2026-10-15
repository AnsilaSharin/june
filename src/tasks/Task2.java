package tasks;

public class Task2 {
	public static void main(String args[]) {
//		age , weight
//		age>=18
//		    weight >= 50
//		        print eligible to donate blood
//
//		print not eligible
		int age = 20,weight=30;
		if(age>=18) {
			if(weight>=50) {
				System.out.println("eligible to donate blood");
			}
			else {
				System.out.println("not eligible");
			}
		}
		
	}

}
