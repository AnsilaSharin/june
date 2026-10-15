package methodsandconstroctors;

import java.util.Scanner;
//function with parameter and parameter

public class MethodScanner2 {
	public int add(int num1,int num2) {
		int sum;
		return sum = num1+num2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodScanner2 ob=new MethodScanner2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=scan.nextInt();
		System.out.println("Enter second number : ");
		int  num2=scan.nextInt();
		System.out.println(ob.add(num1, num2));

	}

}
