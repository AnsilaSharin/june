package oops;

public class UsingThis {
	String name;
	int rno;
	float fee;
	
	public  UsingThis(String name, int rno, float fee) {
		this.name=name;
		this.rno=rno;
		this.fee=fee;
		}
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("rno = "+rno);
		System.out.println("fee = "+fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThis  ob = new UsingThis("Neha", 10, 10000.40f);
		ob.display();


	}

}
