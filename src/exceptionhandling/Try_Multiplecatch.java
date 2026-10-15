package exceptionhandling;

public class Try_Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20;
		int arr[]=null;
		try {
			System.out.println(arr[1]);
		}
		catch (ArithmeticException e1) {
			// TODO: handle exception
			System.out.println(e1);
		}
		catch (IndexOutOfBoundsException e2) {
			// TODO: handle exception
			System.out.println(e2);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("hello");

	}

}
