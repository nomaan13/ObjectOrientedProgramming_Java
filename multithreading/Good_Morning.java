package multithreading;

public class Good_Morning extends Thread{
	
	
	@Override
	public void run() {
		for(int i =1;i<=7;i++) {
			System.out.println("Good Morning!!!!!!!");
		}
	}
	

}
