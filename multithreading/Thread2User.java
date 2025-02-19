package multithreading;

public class Thread2User {
	
		public static void main(String[] args) {
			MyThread2 m2 = new MyThread2();
			
			for(int i =1;i<=15;i++) {
				System.out.println("hii " +i);
				/*try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}*/
			}
			
			m2.start();
//			m3.start();
			
		}
		
	}
