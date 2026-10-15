package operators;

public class Bitwise {
	public static void main(String args[]) {
		int a=15,b=16;
		System.out.println("a=15 :"+Integer.toBinaryString(a));
		System.out.println("b=16 :"+Integer.toBinaryString(b));
		
		//bitwise OR(|)
		
		System.out.println("15|16 = "+(a|b));
		System.out.println("15|16 :"+Integer.toBinaryString(a|b));
		
		//Bitwise AND(&)
		
		System.out.println("15&16 = "+(a&b));
		System.out.println("15&16 :"+Integer.toBinaryString(a&b));
		
		//Bitwise XOR(^)
		
		System.out.println("15^16 = "+(a^b));
		System.out.println("15^16 :"+Integer.toBinaryString(a^b));
		
		//Bitwise Complement
		
		System.out.println("Bitwise OR = "+(~15));
		System.out.println("Bitwise OR :"+Integer.toBinaryString(~15));
		
		System.out.println("Bitwise OR = "+(~16));
		System.out.println("Bitwise OR :"+Integer.toBinaryString(~16));
		
		
		
		
	}

}
