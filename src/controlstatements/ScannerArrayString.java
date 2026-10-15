package controlstatements;

import java.util.Scanner;

public class ScannerArrayString {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		 System.out.print("Enter number of rows: ");
	        int rows = scan.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = scan.nextInt();

	        int[][] a = new int[rows][cols];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                a[i][j] = scan.nextInt();
	            }
	        }

	        System.out.println("Array elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }

	        
	    }
}	
		
	


