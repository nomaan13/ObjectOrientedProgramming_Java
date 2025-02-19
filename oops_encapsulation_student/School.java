package oops_encapsulation_student;

public class School{
	
		static String school_Name = "KVS"; 
		
		public School() {
			
			
		}
	
		private Student st = new Student();

		public Student getStudentName() {
			return st;
		}

		public void setSt(Student st) {
			this.st = st;
		}

		

		
		
		
		
		
		
	
	

}
