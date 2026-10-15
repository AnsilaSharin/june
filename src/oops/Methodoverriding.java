package oops;

public class Methodoverriding {
	static class BirDs{
		public void sounds() {
			System.out.println("tweet...tweet...");
		}
	}
	static  class DuCk extends BirDs {
		public void sounds() {
			System.out.println("quack..quack..");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuCk ob = new DuCk();
		//BirDs ob =new DuCk();
		ob.sounds();

	}

}
