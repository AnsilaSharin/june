package oops;

public class Without_This {
	String name;
	int rno;
	float fee;
	
	public  Without_This(String name, int rno, float fee) {
	name=name;
	rno=rno;
	fee=fee;
	}
	
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("rno = "+rno);
		System.out.println("fee = "+fee);
		
	}
	public static void main(String args[]) {
		Without_This ob = new Without_This("Neha", 10, 10000.40f);
		ob.display();

	}
}
