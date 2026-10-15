package exceptionhandling;
class ThreadNew extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("New Thread");
			try {
				Thread .sleep(20000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadDemo {
	public static void main(String args[]) throws InterruptedException {
		ThreadNew ob = new ThreadNew();
		ob.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
		
	}

}
