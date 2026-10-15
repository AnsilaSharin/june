package tasks;

import java.util.Scanner;

public class EvenOddTurnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);


	}

}
