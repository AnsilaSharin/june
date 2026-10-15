package oops;

public class Car1 implements Vehicle1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v = new Car1();
		v.start();

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("self Start...");
	}

}
