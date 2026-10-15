package controlstatements;

public class ArrayanandString {

	public static void main(String[] args) {
		//length
		String s1="India";
		System.out.println(s1.length());
		
		//charAt
		String s2="Calicut";
		System.out.println(s2.charAt(3));
		
		//CompareTo
		String a="hello";
		String b="hello";
		String c="hai";
		String d="flag"; 
		//+
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];
		arr[0][0]=20;
		arr[0][1]=40;
		arr[1][0]=60;
		arr[1][1]=80;
		arr[2][0]=90;
		arr[2][1]=100;
		System.out.println(arr[1][1]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		//array declaration with initialization
		int a[][]= {{2,1},{3,4},{4,5},{2,1},};
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}


}
