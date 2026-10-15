package tasks;

import java.util.Scanner;

public class SumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first number : ");
	    int p = scan.nextInt();
	    System.out.println("Input the second number : ");
	    int q = scan.nextInt();
	    System.out.println("input the third number : ");
	    int r = scan.nextInt();
	    boolean res =((p + q)==r ||(q+r)==p||(r+p)==q);
	    System.out.println("The result is : "+res);
	}

}
