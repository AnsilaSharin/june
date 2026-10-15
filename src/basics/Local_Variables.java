package basics;

public class Local_Variables {
	//local variable
	public void add() { //method
		int num1=10,num2=20,sum;
		sum = num1+num2;
		System.out.println(sum);
		}
	public static void main(String args[]) { //start
		Local_Variables obj = new Local_Variables();//object creation
		obj.add();
	}

}
