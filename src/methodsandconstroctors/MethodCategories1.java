package methodsandconstroctors;

public class MethodCategories1 {
	//funtion with no return type and no parameter
	public void areaOfRectangle() {
		float l=2.2f,b=3.2f,area;
		area=l*b;
		System.out.println("Area "+area);
	}

	public static void main (String args[]) {
		MethodCategories1 ob = new MethodCategories1();
		ob.areaOfRectangle();
	}

}
