package has_a_composition;

public class Driver {
	public static void main(String[] args) {
		Car c1= new Car("Mesarati",908765.2);
		
	    System.out.println("Car object address: " + c1);
		System.out.println("Car engine obkect address: " + c1.e);
		System.out.println("****************************************************************************************");
		c1.displayCar();
		System.out.println("****************************************************************************************");
		Car c2 =new Car("BMW" , 8500300.20,new Engine(80,8,"Disel"));
		c2.displayCar();
		System.out.println("****************************************************************************************");
		Car c3 = new Car("jeep",5000000.2,new Engine(70,8,"Disel"));
		c3.displayCar();
		
	}

}
