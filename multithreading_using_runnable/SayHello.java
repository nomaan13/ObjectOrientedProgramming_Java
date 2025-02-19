package multithreading_using_runnable;

public class SayHello implements Runnable {
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("Hello.....");
			
		}
}}

