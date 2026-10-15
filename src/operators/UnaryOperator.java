package operators;

public class UnaryOperator {
	public static void main(String args[]) {
		int n = 100;
		n=-n;
		System.out.println(n);
		
		//unary not !
		boolean val = true;
		System.out.println(!val);
		
		//unary increment 
		int num = 10;
		//Pre increment
		++num;
		System.out.println("++num : " +num);
		//post increment
		num++;
		System.out.println("num++ : " +num);
		
		//unary decrement 
		num--;
		System.out.println("num-- : " +num);
		
		--num;
		System.out.println("--num : " +num);
		
		//bitwise complement
		System.out.println(~num);
		
	
	}

}
