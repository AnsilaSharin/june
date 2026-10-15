package oops;

public class ChangeName_WithoutThis {
	String name;
	int rno;
	float fee;
	
	public  ChangeName_WithoutThis(String nam, int rollno, float fees) {
	name=nam;
	rno=rollno;
	fee=fees;
	}
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("rno = "+rno);
		System.out.println("fee = "+fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeName_WithoutThis  ob = new ChangeName_WithoutThis("Neha", 10, 10000.40f);
		ob.display();


	}

}
