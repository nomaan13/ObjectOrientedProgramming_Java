package method_overriding;

public class Car extends Vehicle
{
	String name="X3";
	@Override
	public void start() {
		System.out.println("Start the Car!!");
	}

}
