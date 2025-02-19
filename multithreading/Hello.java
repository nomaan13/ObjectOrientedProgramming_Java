package multithreading;


public class Hello extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <=7; i++) {
			System.out.println("Hello.....");
			
		}
	}

}
