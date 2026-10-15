package classworks;

public class CntrlStmnt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Table of 24 using for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("24 x " + i + " = " + (24 * i));
        }

        System.out.println();

        // Table of 50 using while loop
        int j = 1;
        while (j <= 10) {
            System.out.println("50 x " + j + " = " + (50 * j));
            j++;
        }

        System.out.println();

        // Table of 29 using do-while loop
        int k = 1;
        do {
            System.out.println("29 x " + k + " = " + (29 * k));
            k++;
        } while (k <= 10);

        

	}

}
