package operators;

public class Task7 {
	public static void main(String args[]) {
		
		int a=20,b=50;
		boolean A =a==b;
		boolean B =a<=b;
		//Logical OR
		System.out.println("a&&b : "+(A&&B));
		System.out.println("(a&&b)||(a&&B) : "+((A&&B)||(A&&B)));
		System.out.println("(!(a&&b)||(a&&b)) :"+(!(A&&B)||(A&&B)));
			
		}

}
