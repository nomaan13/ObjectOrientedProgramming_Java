package association_aggregation;

public class Student {
	int id;
	String name;
//	Address ad ;
	
	Address ad = new Address();
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	Student(int id ,String name,Address ad){
		this.id=id;
		this.name=name;
		this.ad=ad;
		
	}
	
	public void displayStudentDetails() {
		System.out.println("Student id is : "+ id );
		System.out.println("Student name is : "+ name );
		ad.printAddress();
				
		
	}
	
	

}
