package association_aggregation;

public class Driver {
	public static void main(String[] args) {
		Address a1 = new Address("Noida",112090,"Uttar Pradesh");
		Student s1 = new Student(90,"Jaccck",a1);
		
		
		s1.displayStudentDetails();
	}

}
