package oops;

abstract class VehicLE {
	public abstract void start();
	
	public void sound() {
		System.out.println("Beep..Beep");
	}
	
}
class Bike extends VehicLE{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("kick start");
	}
	
}
class Train extends VehicLE{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button Start");
	}
	
}

public class AbstractClass {
	public static void main(String args[]) {
		Bike b= new Bike();
		b.sound();
		b.start();
		
		VehicLE t = new Train();//Up-Casting
		t.sound();
		t.start();
	}
	

}
