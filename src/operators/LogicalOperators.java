package operators;

public class LogicalOperators {
	public static void main(String args[] ) {
		int n1=20,n2=50;
		boolean A = n1==n2; //FALSE
		boolean B = n1<=n2; //TRUE
		
		//logical not
		System.out.println("logical not : ! A = "+(!A));
		System.out.println("logical not : ! B = "+(!B));
		
		//Logical AND
		System.out.println("logical AND : A&&B = "+(A&&B));
		
		
		System.out.println("logical OR : A||B "+(A||B));
		
	}

}
