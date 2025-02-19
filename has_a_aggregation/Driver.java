package has_a_aggregation;

public class Driver {

	public static void main(String[] args) {
		Address a1 = new Address("Kolkata" , "WB",  500623);
		Address a2 = new Address("Raebareli", "UP", 229001);
		Address a3 = new Address("Bhopal","MP",     321560);
		
		Student s1 = new Student("Nomaan",33,a2);
		s1.displayStudent();
		
		Student s2 = new Student("Jon", 30,a1);
		s2.displayStudent();
		
		Student s3 = new Student("Jack", 45,a2);
		s3.displayStudent();
		
		Student s4 = new Student("Tom", 50,a3);
		s4.displayStudent();
	}
	

}
