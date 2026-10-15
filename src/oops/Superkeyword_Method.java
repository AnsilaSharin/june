package oops;
class Superclass1{
	public void display() {
		String name="Anu";
		System.out.println(name);
	}
	
}
	

public class Superkeyword_Method extends Superclass1{
	
	public void display() {
		String name="Anupama";
		super.display();
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword_Instance key = new SuperKeyword_Instance();
		key.display();

	}

}
