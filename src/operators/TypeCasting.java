package operators;

public class TypeCasting {
	public static void main(String args[]) {
		char val='A';
		int num=val;
		float deci=num;
		System.out.println("---widening TypeCasting---");
		System.out.println("val = "+val +" \t" +"num = "+num + " \t" +"deci = " +deci);
		
		System.out.println("======================");
		float deci1=66.0f;
		int num1=(int)deci1;
		char val1=(char)num1;
		System.out.println("---Narrowing TypeCasting---");
		System.out.println("deci1 = "+deci1 +" \t" +"num1 = "+num1 + " \t" +"val1 = " +val1);
	}

}
