package classworks;

public class CntrlStmnt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a = {1, 4, 17, 7, 25, 3, 100};

	        int sum = 0;
	        double avg;

	        for (int i = 0; i < 5; i++) {
	            sum = sum + a[i];
	        }

	        avg = sum / 5.0;

	        System.out.println("The average of the said array is: " + avg);

	        System.out.println("The numbers greater than average are:");

	        for (int i = 0; i < 7; i++) {
	            if (a[i] > avg) {
	                System.out.println(a[i]);
	            }
	        }
	}

}
