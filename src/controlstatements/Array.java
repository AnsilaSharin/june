package controlstatements;

public class Array {
	public static void main(String args[]) {
		int arr[] = new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		//System.out.println(arr[3]);//random access
		for(int i=0;i<arr.length;i++) { //sequentially access
			System.out.println(arr[i]);
		}
		
	}

}
