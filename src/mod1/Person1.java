package mod1;

public class Person1{
	//globallly access
	//public String name = "Aradhya";
	//public int age = 23;
	
	protected String name = "Aradhya";
	protected int age = 23;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1();

		System.out.println("Name = "+p.name);
		System.out.println("Age = "+p.age);
	}

}
