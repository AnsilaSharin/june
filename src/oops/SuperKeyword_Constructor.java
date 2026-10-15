package oops;
class Superclass2{
	public void display() {
		String name="Anu";
		System.out.println(name);
	}
//	public void SuperClass(String name) {
//		System.out.println();
//		
//	}
}



public class SuperKeyword_Constructor extends Superclass2{
	public SuperKeyword_Constructor() {
		//super();
		String name="Anupama";
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword_Constructor con = new SuperKeyword_Constructor();
		
	}

}
