package oops;
class Superclass{
	String name="Anu";
}

public class SuperKeyword_Instance extends Superclass {
	String name="Anupama";
	
	public void display() {
		System.out.println(super.name);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword_Instance key = new SuperKeyword_Instance();
		key.display();

	}

}
