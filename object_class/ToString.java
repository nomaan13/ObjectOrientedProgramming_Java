package object_class;

public class ToString {

	String name ;
	int id ;
	double salary;
	
	public ToString() {
		
	}
	
	ToString (String name, int id , double salary){
		this.name  	= name;
		this.id  	= id;
		this.salary = salary;
	}
	
	
	public String toString() {
		return "Name is : "+name  + "\nId is: " + id +"\nSalary is : " + salary;
		
	}
}
