package operators;

public class ShiftOperators {
	public static void main(String args[]) {
		int x=4,y=-4;
		System.out.println("4==> "+Integer.toBinaryString(x));
		System.out.println("-4==> "+Integer.toBinaryString(y));
		
		System.out.println("Left shift : 4 = "+(x<<4));
		System.out.println(Integer.toBinaryString(x<<4));
		
		System.out.println("Right shift : 4 = "+(x>>2));
		System.out.println(Integer.toBinaryString(x>>2));
		
		System.out.println("Unsigned Right Shift : 4 = "+(x>>1));
		System.out.println(Integer.toBinaryString(x>>>4));
		
		System.out.println("Left shift : -4 = "+(y<<4));
		System.out.println(Integer.toBinaryString(y<<4));
		
		System.out.println("Right shift : -4 = "+(y<<4));
		System.out.println(Integer.toBinaryString(y<<4));
		
		System.out.println("Unsigned Right shift : -4 = "+(y<<4));
		System.out.println(Integer.toBinaryString(y<<4));
		
	}

}
