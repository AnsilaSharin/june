package oops;
	class Laptop{
		String color;
		public void version() {
			System.out.println("Windows");
		}
	}
	class HP extends Laptop{
		String core="intel core";
		public void price() {
			System.out.println("55000");
		}
		}
	class Lenovo extends Laptop{
		String name="Pavilion";
		public void color() {
			System.out.println("blue");
		}
	}
public class Hierarchical_Inheritance {
	public static void main(String args[]) {
	HP ob=new HP();
	System.out.println("Hp core is :"+(ob.core="intel"));
	
   
	}
}
