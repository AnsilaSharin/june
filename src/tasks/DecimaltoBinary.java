package tasks;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1=new Scanner(System.in);
		System.out.println("Input decimal number : ");
		int num = scan1.nextInt();
		System.out.println("Binary num is : "+Integer.toBinaryString(num));
	
	}

}
