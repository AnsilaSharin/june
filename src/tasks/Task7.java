package tasks;

public class Task7 {
	public static void main(String args[]) {
//		a,b,c
//		a<b && a<c
//		print smallst a
//		b<a && b<c
//		print smallest b
//
//		print smallest c
		int a=10,b=5,c=8;
		if(a<b && a<c) {
			System.out.println("Smallest a = " +a);
		}
		else if(b<a && b<c) {
			System.out.println("Smallest b = "+b);
		}
		else {
			System.out.println("Smallest c = " +c);
		}
	}

}
