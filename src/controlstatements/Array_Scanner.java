package controlstatements;

import java.util.Scanner;

public class Array_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraysize;
		System.out.println("Entetr your array size : ");
		arraysize= scan.nextInt();
		int arr[]=new int[arraysize];
		System.out.println("Enter your array elements : ");
		for(int i=0;i<arr.length;i++) {
			arraysize=scan.nextInt();
		}
		System.out.println("array elements : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			
	
	}

}
