package methodsandconstroctors;

import java.util.Scanner;

public class AreaOfCircle1 {
	
	public void add() {
		Scanner scan = new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("Enter first number : ");
		num1=scan.nextInt();
		System.out.println("Enter second number : ");
		num2=scan.nextInt();
		sum=num1+num2;
		System.out.println("Sum = "+sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle1 ob=new AreaOfCircle1();
		ob.add();
	
	}

}
