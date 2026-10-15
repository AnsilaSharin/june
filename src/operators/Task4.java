package operators;

public class Task4 {
	//4. x+z/x+(z%y)*(z-x);
	int x=2,y=3,z=6; //instance
	public static void main(String args[]) {
		Task4 obj = new Task4();
		
		System.out.println(obj.x+obj.z/obj.x+(obj.z%obj.y)*(obj.z-obj.x));
	
		
	}

}
