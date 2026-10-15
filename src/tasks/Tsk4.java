package tasks;

public class Tsk4 {
	public static void main(String args[]) {
//		Above 90 A
//
//		70 to 89 B
//
//		50 to 69 C
//
//		bellow 50 D
		int mark =45;
		char grade;
		if (mark>90) {
			System.out.println("Grade = A");	
			
		}
		else if(mark >70) {
			System.out.println("Grade = B");
				
			}
		else if(mark >50) {
			System.out.println("Grade = C");
			
			
		}
		else if(mark<50) {
			System.out.println("Grade = D");
			
		}
	}
}


