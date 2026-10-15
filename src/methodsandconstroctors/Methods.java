package methodsandconstroctors;

public class Methods {
	public void add() { //nonstatic or instance
		int num1=40,num2=20,sum;
		sum =num1+num2;
		System.out.println("Sum is = "+sum);
		
	}
	public static void main(String args[]) { //start
		
	
	int num1 =100,num2=500;
	System.out.println("Maximum value is : "+Math.max(num1, num2));
	
	Methods obj = new Methods();
	obj.add();
	
	}
}
