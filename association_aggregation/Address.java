package association_aggregation;

public class Address {
	String city;
	int pin;
	String state;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	Address(String city,int pin ,String state){
		this.city= city;
		this.pin=pin;
		this.state=state;
		
		
	}
	
	
	public void printAddress() {
		System.out.println("City name is : " + city);
		System.out.println("City pin is : " + pin);
		System.out.println("State of city is : "+ state);
	}

}
