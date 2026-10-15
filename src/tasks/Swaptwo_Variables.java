package tasks;

public class Swaptwo_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int m = 9;
	        int n = 5;
	        System.out.println("Before Swapping : " );
	        System.out.println("m = "+m +" ,\tn = "+n);

	        m = m + n;
	        n = m - n;
	        m = m - n;

	        System.out.println("m = " + m + " , n = " + n);		
		

	}

}
