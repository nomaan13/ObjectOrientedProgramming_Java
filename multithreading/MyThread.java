package multithreading;

public class MyThread{

	
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Good_Morning gm = new Good_Morning();
		
		h1.start();
		
		gm.start();
	}

}
