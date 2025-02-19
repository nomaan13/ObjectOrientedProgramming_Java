package structure;



public class Cat extends OverridingExampleAnimal{
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat meaowww...............");
	}
	
	@Override
	public void run() {
		System.out.println("Cat is Running....................");
	}
	
	
	public static void main(String[] args) {
		OverridingExampleAnimal cat = new Cat();
		
		cat.sound();
		cat.run();
	}
	

}
