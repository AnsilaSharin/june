package classworks;

import java.util.Scanner;

public class CntrlStmnt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Input a number: ");
	        int num = sc.nextInt();

	        if (num % 2 == 0) {
	            System.out.println(1);
	        } else {
	            System.out.println(0);
	        }

	}

}
