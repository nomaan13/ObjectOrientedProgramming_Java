package has_a_aggregation;

public class Address {
	 String city;
	 String state;
	 int pincode;
	 
	 
	 Address() {
		// TODO Auto-generated constructor stub
	}
	 Address(String city, String state, int pincode){
		 this.city= city;
		 this.state=state;
		 this.pincode=pincode;
		 
	 }
	 
	 public void displayAddress() {
		 System.out.println("City name :" + city);
		 System.out.println("State name : " + state);
		 System.out.println("City's pincode " + pincode);
	}

}
