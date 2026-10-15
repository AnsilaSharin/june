package exceptionhandling;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		try {
			System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");

	}

}
