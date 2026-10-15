package operators;

public class Task6 {
	public static void main(String args[]) {
		int a=15,b=20;
		boolean A=a==b; 
		boolean B=a<=b;
		//Logical AND
		System.out.println("a||b : " +(A||B));
		
		System.out.println(!((A||B)&&(A||B)));
		
	}

}
