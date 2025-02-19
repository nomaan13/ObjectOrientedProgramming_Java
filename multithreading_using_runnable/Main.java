package multithreading_using_runnable;

public class Main {

	public static void main(String[] args) {
		SayHello s1 = new SayHello();
		Thread t1 = new Thread(s1);
		
		t1.start();
//		
		
		Runnable r1 = ()->{
			for (int i = 1; i <=5; i++) {
				System.out.println("Hello.....");
				
			}
		};

		Thread t2 = new Thread(r1);
		t2.start(); 
	}

}
