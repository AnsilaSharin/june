package oops;
class Finalclass{
	public final void display() {
		System.out.println("Hello...");
	}
}

public class FinalKeyword_Method extends Finalclass{
	public void dsiplay() {
		System.out.println("java programming.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword_Method key=new FinalKeyword_Method();
		key.display();
	}

}
