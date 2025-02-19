package multithreading_using_runnable;

public class Driver {
	
	
	public static void main(String[] args) {
		
		
		Table5 t = new Table5();
		
		Thread t1 = new Thread(t);
		
		t1.start();
		
//		=========================================================
		Runnable r1 = ()->{
			int n =5;
			for (int i = 1; i <=10; i++) {
				System.out.println("5 x "+i +" = " + n*i);
				
			} 
		};
		
		Thread t2 = new Thread(r1);
		t2.start();
	}

}
