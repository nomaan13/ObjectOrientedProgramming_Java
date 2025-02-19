package has_a_aggregation;

public class Student {
	String name;
	int roll_no;
	Address a = new Address();
	
	Student(String name, int roll_no) {
		this.name= name;
		this.roll_no= roll_no;
		
	}
	
	public Student(String name, int roll_no, Address a) {
		this.name= name;
		this.roll_no= roll_no;
		this.a=a;
				
	}
	
	public void displayStudent() {
		System.out.println("Student's name :" + name);
		System.out.println("Student's roll no. :"+ roll_no);
		a.displayAddress();
		System.out.println("***********************************");
	}
	

}
